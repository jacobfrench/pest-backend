package stu.csub.dbproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stu.csub.dbproject.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
