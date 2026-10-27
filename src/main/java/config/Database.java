/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class Database {
    private static final String URL =
        "jdbc:mysql://localhost:3306/db_sikursus";
    private static final String USER = "root";
    private static final String PASS = "";
    
    private Database() {
        // Mencegah object Database dibuat sembarangan.
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
