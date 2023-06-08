package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CollectionUtil {

    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("problem occurred locating driver");
        }

        String url= " ";
        String username = "postgres";
        String password = "password";

        return DriverManager.getConnection(url, username, password);
    }
}
