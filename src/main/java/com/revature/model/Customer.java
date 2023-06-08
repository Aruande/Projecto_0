package com.revature.model;

public class Customer {

    //fields
    private int customerId;
    private String customerName;
    private String email;
    private String address;


    public Customer() {

    }
    //all args constructor
    public Customer(int customerId, String customerName, String email, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
    }
    //all args constructor minus id
    public Customer(String customerName, String email, String address) {
        this.customerName = customerName;
        this.email = email;
        this.address = address;
    }

    // getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomer_id(int customer_id) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString() printing objects in Sting form (instead of memory address)


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
