package com.revature.service;

import com.revature.DAO.CustomerDAO;
import com.revature.DAO.CustomerDAOInterface;
import com.revature.model.Customer;

public class CustomerService {

    private final CustomerDAOInterface customerDAO = new CustomerDAO();

    public Customer getCustomerById(int id){
        if (id > 0){
            return customerDAO.getCustomerById(id);
        }
        return null;
    }
}
