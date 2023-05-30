package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String[] args) {

        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=lucarauj");

            System.out.println("Conexão recuperada!");

            connection.close();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}
