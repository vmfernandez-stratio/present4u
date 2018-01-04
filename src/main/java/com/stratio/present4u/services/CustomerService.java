package com.stratio.present4u.services;


import org.hibernate.exception.ConstraintViolationException;

import java.util.ArrayList;

public interface CustomerService {

    ArrayList<Customer> showAllCustomers();

    Customer findCustomerById(Long id);

    boolean createCustomer(Customer customer);

    boolean modifyCustomer(Customer customer);

    boolean deleteCustomerById(Long id) throws ConstraintViolationException;

    boolean modifyCustomerDeleteCustomerInvoice(Customer customer, Long id);
}
