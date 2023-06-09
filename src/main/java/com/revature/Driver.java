package com.revature;

import com.revature.DAO.CustomerDAO;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Driver {
    public static void main(String[] args) {

        try(Connection conn = ConnectionUtil.getConnection()){
            System.out.println("connection successful");
        }
        catch (SQLException e){
            System.out.println("connection failed");
        }

        CustomerDAO customerDAO = new CustomerDAO();

        System.out.println(customerDAO.getCustomerById(2));


    }
}
