package com.stratio.present4u.services.impl;

import com.ikea.customers.CustomersApplication;
import com.ikea.customers.model.Card;
import com.ikea.customers.model.Customer;
import com.ikea.customers.model.CustomerInvoice;
import com.ikea.customers.repo.CardRepository;
import com.ikea.customers.repo.CustomerInvoiceRepository;
import com.ikea.customers.repo.CustomerRepository;
import com.ikea.customers.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;


@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomersApplication.class);

    @Autowired
    private CustomerInvoiceRepository customerInvoiceRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CardRepository cardRepository;

    public ArrayList<Customer> showAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        for (Customer customer : customerRepository.findAll()) {
            customers.add(customer);
            log.info(customer.toString());
        }
        return customers;
    }

    public Customer findCustomerById(Long id) {
        Customer customer = customerRepository.findOne(id);
        return customer;
    }

    public boolean createCustomer(Customer customer) {

        if (customer.getCustomerid() != null) {
            if (customerRepository.findOne(customer.getCustomerid()) != null)
                throw new EntityNotFoundException();
        }

        for (CustomerInvoice customerInvoice : customer.getCustomerInvoices()) {
            customerInvoiceRepository.save(customerInvoice);
        }
        for (Card card : customer.getCards()) {
            cardRepository.save(card);
        }

        customerRepository.save(customer);
        return true;


    }

    public boolean modifyCustomer(Customer customer) {

        if (customerRepository.findOne(customer.getCustomerid()) != null) {
            customerRepository.save(customer);
        } else {
            throw new EntityNotFoundException();
        }

        return true;
    }

    public boolean modifyCustomerDeleteCustomerInvoice(Customer customer, Long id) {

        if (customerRepository.findOne(customer.getCustomerid()) == null) {
            throw new EntityNotFoundException();
        }
        customer.getCustomerInvoices().remove(customerInvoiceRepository.findById(id));
        customerRepository.save(customer);

        return true;

    }

    public boolean deleteCustomerById(Long id) throws EntityNotFoundException {
        Customer customer = customerRepository.findOne(id);
        if (customer == null) {
            throw new EntityNotFoundException();
        }
        log.info(customer.toString());
        customerRepository.delete(id);
        return true;
    }

}

