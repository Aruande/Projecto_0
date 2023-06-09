package com.revature.DAO;

import com.revature.model.Customer;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO implements CustomerDAOInterface{
    @Override
    public Customer getCustomerById(int id) {
        try(Connection conn = ConnectionUtil.getConnection()) {


            //holds SQL command that runs on the database
            String sql = "SELECT * FROM customers WHERE customer_id = ?";
            //preparedStatement object to fill in wildcard
            PreparedStatement ps = conn.prepareStatement(sql);
            //inserting a value for the wildcard
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {


                //extract the customer data from the Resultset. uses the all-args constructors
                Customer customer = new Customer(
                        rs.getInt("customer_id"),
                        rs.getString("customer_name"),
                        rs.getString("email"),
                        rs.getString("address")
                );

                return customer;
            }


        }catch (SQLException e){
            System.out.println("error getting Customer");
            e.printStackTrace();

        }
        return null;
    }
}
