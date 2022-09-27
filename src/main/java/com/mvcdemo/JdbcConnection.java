package com.mvcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
public static Connection connect;
public static Connection getconnect() throws SQLException{
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","satya@704771");
        return connect;
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return null;
}



}