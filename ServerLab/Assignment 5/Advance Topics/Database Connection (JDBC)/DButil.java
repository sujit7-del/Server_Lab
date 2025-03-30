package com.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;

public class DBUtil {
    public static Connection getConnection(ServletContext context) throws SQLException {
        String dbURL = context.getInitParameter("dbURL");
        String dbUser = context.getInitParameter("dbUser");
        String dbPassword = context.getInitParameter("dbPassword");

        return DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }
}
