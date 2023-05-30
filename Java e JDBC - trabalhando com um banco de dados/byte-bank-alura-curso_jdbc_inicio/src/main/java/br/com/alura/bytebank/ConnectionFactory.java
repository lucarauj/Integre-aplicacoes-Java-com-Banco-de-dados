package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperarConecao() {

        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=lucarauj");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
