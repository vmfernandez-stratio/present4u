//package com.stratio.present4u.services.impl;
//
//
//import com.stratio.present4u.Present4uApplication;
//import com.stratio.present4u.exceptions.EntityNotFoundException;
//import com.stratio.present4u.model.Employee;
//import com.stratio.present4u.repo.EmployeeRepository;
//import com.stratio.present4u.services.EmployeeService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private static final Logger log = LoggerFactory.getLogger(Present4uApplication.class);
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public ArrayList<Employee> showAllEmployees() {
//        ArrayList<Employee> employees = new ArrayList<>();
//        for (Employee employee : employeeRepository.findAll()) {
//            employees.add(employee);
//            log.info(employee.toString());
//        }
//        return employees;
//    }
//
//    public Employee findEmployeeById(Long id) {
//        Employee employee = employeeRepository.findOne(id);
//        return employee;
//    }
//
//    public boolean createEmployee(Employee employee) throws EntityNotFoundException {
//
//        if (employee.getEmployeeid() != null) {
//            if (employeeRepository.findOne(employee.getEmployeeid()) != null)
//                throw new EntityNotFoundException();
//        }
//
//        employeeRepository.save(employee);
//        return true;
//    }
//
//    public boolean modifyEmployee(Employee employee) throws EntityNotFoundException {
//
//        if (employeeRepository.findOne(employee.getEmployeeid()) != null) {
//            employeeRepository.save(employee);
//        } else {
//            throw new EntityNotFoundException();
//        }
//
//        return true;
//    }
//
//    public boolean modifyEmployeeDeleteEmployeeInvoice(Employee employee, Long id) throws EntityNotFoundException {
//
//        if (employeeRepository.findOne(employee.getEmployeeid()) == null) {
//            throw new EntityNotFoundException();
//        }
////        employee.getEmployeeInvoices().remove(employeeInvoiceRepository.findById(id));
//        employeeRepository.save(employee);
//
//        return true;
//
//    }
//
//    public boolean deleteEmployeeById(Long id) throws EntityNotFoundException {
//        Employee employee = employeeRepository.findOne(id);
//        if (employee == null) {
//            throw new EntityNotFoundException();
//        }
//        log.info(employee.toString());
//        employeeRepository.delete(id);
//        return true;
//    }
//
//}
//
