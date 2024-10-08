/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brick_breaker_game_final1;

import java.sql.*;
import java.sql.Connection;

public class MySQLConnector{

    static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Connection c;
    Statement s;

    MySQLConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/brick_breaker_db", "root", "Helloworld@2024");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            // Handling the exception
        }
    }
}