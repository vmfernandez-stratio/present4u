package com.stratio.present4u.repo;


import com.stratio.present4u.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Employee, Long> {

    Employee findByCustomerid(Long customerid);
}