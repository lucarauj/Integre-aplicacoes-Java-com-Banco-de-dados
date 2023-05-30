# Integre aplicações Java com Banco de dados

## Java e JDBC: trabalhando com um banco de dados

### Criando e populando um database:

```
CREATE TABLE conta (
  numero integer NOT NULL,
  saldo numeric(10,0) DEFAULT NULL,
  cliente_nome varchar(50) DEFAULT NULL,
  cliente_cpf varchar(11) DEFAULT NULL,
  cliente_email varchar(50) DEFAULT NULL,
  PRIMARY KEY (numero)
);
```
### Baixando driver do PostgreSQL (https://mvnrepository.com/):

```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
```
