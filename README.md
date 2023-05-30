# Integre aplicações Java com Banco de dados

## Java e JDBC: trabalhando com um banco de dados

### Criando e populando uma tabela:

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

### Factory Pattern:

- Padrão reconhecido e útil em vários contextos. Recomenda-se utilizá-lo para a criação de objetos.

### Exceções:

- Checked: herdam diretamente da classe Exception. São verificadas em tempo de compilação e precisam de tratamento;
- Unchecked: herdam de RuntimeException e são verificadas em tempo de execução;

### SQL Injection:

- Ataque cibernético que explora vulnerabilidades em sistemas de gerenciamento de banco de dados (DBMS) que não tratam adequadamente a entrada de dados fornecida pelos usuários;
- Statement x PreparedStatement: é recomendado usar o PreparedStatement já que ele automaticamente evita a SQL Injection;

### HikariCP:

- Gerenciamento de conexões com bancos de dados em aplicativos Java, melhorando o desempenho e a eficiência geral do acesso ao banco de dados;

```
<dependency>
   <groupId>com.zaxxer</groupId>
   <artifactId>HikariCP</artifactId>
   <version>5.0.1</version>
</dependency>
```