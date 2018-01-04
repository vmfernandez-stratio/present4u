package com.stratio.present4u.services;


import com.stratio.present4u.model.Employee;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;

public interface EmployeeService {

    ArrayList<Employee> showAllEmployees();

    Employee findEmployeeById(Long id);

    boolean createEmployee(Employee customer);

    boolean modifyEmployee(Employee customer);

    boolean deleteEmployeeById(Long id) throws ConstraintViolationException;

    boolean modifyEmployeeDeleteEmployeeInvoice(Employee customer, Long id);
}
