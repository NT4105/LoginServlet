/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vothimaihoa
 */
public class Dbconnection {
    private static final String DB_NAME = "LoginServlet";
    private static final String DB_USER_NAME = "SA";
    private static final String DB_PASSWORD = "12345"; // cac ban nen de la 12345 vi de PE de vay

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB_NAME + ";encrypt=false";  // ";trustServerCertificate=true" đều được

        // Add debug logging
        System.out.println("Attempting database connection to: " + url);

        conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
        System.out.println("Database connection successful");
        return conn;
    }
}
