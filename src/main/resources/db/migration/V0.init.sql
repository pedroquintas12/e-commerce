-- Exibe a index errada
SELECT
    tc.CONSTRAINT_NAME,
    kcu.COLUMN_NAME
FROM
    information_schema.TABLE_CONSTRAINTS AS tc
JOIN
    information_schema.KEY_COLUMN_USAGE AS kcu
    ON tc.CONSTRAINT_NAME = kcu.CONSTRAINT_NAME
    AND tc.TABLE_NAME = kcu.TABLE_NAME
    AND tc.TABLE_SCHEMA = kcu.TABLE_SCHEMA
WHERE
    tc.TABLE_NAME = 'usuarios_acesso'
    AND tc.CONSTRAINT_TYPE = 'UNIQUE'
    AND kcu.COLUMN_NAME = 'id_acesso'
    and tc.CONSTRAINT_NAME != 'unique_acesso_user'
    AND tc.TABLE_SCHEMA = DATABASE();


-- dropa o relacionamento com a fk para poder dropar o index errado
ALTER TABLE usuarios_acesso DROP FOREIGN KEY acesso_fk;

-- dropa o index
ALTER TABLE usuarios_acesso DROP INDEX UK8i2xo8dshlxpfclqasqaan41;

-- recoloca a fk na tabela
ALTER TABLE usuarios_acesso
ADD CONSTRAINT acesso_fk
FOREIGN KEY (id_acesso)
REFERENCES acesso(id_acesso);
