package com.revature.model;

public class Bank_Account {

    //fields
    private int accountNumber;
    private int customerId;
    private String accountType;
    private double balance;

    private Customer customer;
    // Allows for the insertion of a new customer using the foreign key variable,
    // instead of an entire customer object
    private int customerId_fk;

    //no args


    public Bank_Account() {
    }

    //all args constructor

    public Bank_Account(int accountNumber, int customerId, String accountType,
                        double balance, Customer customer, int customerId_fk) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
        this.customerId_fk = customerId_fk;
    }

    //All args minus id (with Customer object

    public Bank_Account(String accountType, double balance, Customer customer) {
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
    }

    public Bank_Account(String accountType, double balance, int customerId_fk) {
        this.accountType = accountType;
        this.balance = balance;
        this.customerId_fk = customerId_fk;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerId_fk() {
        return customerId_fk;
    }

    public void setCustomerId_fk(int customerId_fk) {
        this.customerId_fk = customerId_fk;
    }

    //toString() print out Bank_Account object
    @Override
    public String toString() {
        return "Bank_Account{" +
                "accountNumber=" + accountNumber +
                ", customerId=" + customerId +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                ", customerId_fk=" + customerId_fk +
                '}';
    }
}
