package com.stratio.present4u.services.impl;


import com.stratio.present4u.Present4uApplication;
import com.stratio.present4u.exceptions.EntityNotFoundException;
import com.stratio.present4u.model.Employee;
import com.stratio.present4u.repo.EmployeeRepository;
import com.stratio.present4u.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(Present4uApplication.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public ArrayList<Employee> showAllEmployees() {
        ArrayList<Employee> customers = new ArrayList<>();
        for (Employee customer : employeeRepository.findAll()) {
            customers.add(customer);
            log.info(customer.toString());
        }
        return customers;
    }

    public Employee findEmployeeById(Long id) {
        Employee customer = employeeRepository.findOne(id);
        return customer;
    }

    public boolean createEmployee(Employee customer) {

//        if (customer.getEmployeeid() != null) {
//            if (employeeRepository.findOne(customer.getEmployeeid()) != null)
//                throw new EntityNotFoundException();
//        }
//
//        for (EmployeeInvoice customerInvoice : customer.getEmployeeInvoices()) {
//            customerInvoiceRepository.save(customerInvoice);
//        }
//        for (Card card : customer.getCards()) {
//            cardRepository.save(card);
//        }

//        employeeRepository.save(customer);
        return true;


    }

    public boolean modifyEmployee(Employee customer) {

//        if (employeeRepository.findOne(customer.getEmployeeid()) != null) {
//            employeeRepository.save(customer);
//        } else {
//            throw new EntityNotFoundException();
//        }

        return true;
    }

    public boolean modifyEmployeeDeleteEmployeeInvoice(Employee customer, Long id) {

//        if (employeeRepository.findOne(customer.getEmployeeid()) == null) {
//            throw new EntityNotFoundException();
//        }
////        customer.getEmployeeInvoices().remove(customerInvoiceRepository.findById(id));
//        employeeRepository.save(customer);

        return true;

    }

    public boolean deleteEmployeeById(Long id) {
        Employee customer = employeeRepository.findOne(id);
//        if (customer == null) {
//            throw new EntityNotFoundException();
//        }
//        log.info(customer.toString());
//        employeeRepository.delete(id);
        return true;
    }

}

