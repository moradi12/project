package com.coupon.project.dataBase.Service;

import com.coupon.project.dataBase.beans.Customer;
import com.coupon.project.dataBase.Exceptions.CustomerException;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    boolean isCustomerExists(String email, String password) throws CustomerException;

    void addCustomer(Customer customer) throws CustomerException;
    void saveCustomer(Customer customer) throws CustomerException;


    void updateCustomer(Customer customer) throws CustomerException;

    void deleteCustomer(int customerID);

    Optional<Customer> getOneCustomer(int customerID) throws CustomerException;


    List<Customer> getAllCustomers();
}
