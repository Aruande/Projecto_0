package com.revature.DAO;

import com.revature.model.Customer;

public interface CustomerDAOInterface {
    //select a customer by its id
    Customer getCustomerById(int id);
    //update a Customer
}
