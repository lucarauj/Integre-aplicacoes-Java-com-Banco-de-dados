[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Integre-aplicacoes-Java-com-Banco-de-dados/blob/main/LICENSE)

<h1 align="center">Java e JDBC:</h1>
<h2 align="center">Trabalhando com um banco de dados</h2>

<p align="center"><img width="400px" src="https://github.com/lucarauj/assets/blob/main/Java-JDBC.png" /></p>

<br>

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

<br>

### Baixando driver do PostgreSQL (https://mvnrepository.com/):

```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
```

<br>

### Factory Pattern:

- Padrão reconhecido e útil em vários contextos. Recomenda-se utilizá-lo para a criação de objetos.

<br>

### Exceções:

- Checked: herdam diretamente da classe Exception. São verificadas em tempo de compilação e precisam de tratamento;
- Unchecked: herdam de RuntimeException e são verificadas em tempo de execução;

<br>

### SQL Injection:

- Ataque cibernético que explora vulnerabilidades em sistemas de gerenciamento de banco de dados (DBMS) que não tratam adequadamente a entrada de dados fornecida pelos usuários;
- Statement x PreparedStatement: é recomendado usar o PreparedStatement já que ele automaticamente evita a SQL Injection;

<br>

### HikariCP:

- Gerenciamento de conexões com bancos de dados em aplicativos Java, melhorando o desempenho e a eficiência geral do acesso ao banco de dados;

```
<dependency>
   <groupId>com.zaxxer</groupId>
   <artifactId>HikariCP</artifactId>
   <version>5.0.1</version>
</dependency>
```

<br>

### Rollback:

- Garante a integridade dos dados e evita que alterações incorretas ou parcialmente concluídas sejam persistidas no banco de dados;

<br>

### Adicionando coluna na tabela:

```
ALTER TABLE conta ADD COLUMN esta_ativa boolean DEFAULT true;
```

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>

