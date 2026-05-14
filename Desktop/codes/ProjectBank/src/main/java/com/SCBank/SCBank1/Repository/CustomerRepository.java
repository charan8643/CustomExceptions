package com.SCBank.SCBank1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCBank.SCBank1.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer ,Integer> {

}