//package com.stratio.present4u.services;
//
//
//import com.stratio.present4u.exceptions.EntityNotFoundException;
//import com.stratio.present4u.model.User;
//
//import javax.validation.ConstraintViolationException;
//import java.util.ArrayList;
//
//public interface UserService {
//
//    ArrayList<User> showAllUsers();
//
//    User findUserById(Long id);
//
//    boolean createUser(User customer) throws EntityNotFoundException;
//
//    boolean modifyUser(User customer) throws EntityNotFoundException;
//
//    boolean deleteUserById(Long id) throws ConstraintViolationException, EntityNotFoundException;
//
//    boolean modifyUserDeleteUserInvoice(User customer, Long id) throws EntityNotFoundException;
//}
