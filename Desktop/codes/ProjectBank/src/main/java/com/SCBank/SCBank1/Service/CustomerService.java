package com.SCBank.SCBank1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCBank.SCBank1.Entity.Customer;
import com.SCBank.SCBank1.Exception.CustomerNotFoundException;
import com.SCBank.SCBank1.Repository.CustomerRepository;

@Service

public class CustomerService {
	
	
	@Autowired
	private   CustomerRepository customerRepository; //object 
	
	// Creating a user
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	// see created one
	
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("user not found"));
	}
	
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();               //method 
	}
	
	public Optional<Customer> getById(int id) {
		return customerRepository.findById(id);
	}
	
	public String deleteById(int id) {
		
		if 
		(!customerRepository.existsById(id)) {
			throw new CustomerNotFoundException("Customer not found bt id :" +id);
		}
		customerRepository.deleteById(id);
		
		return "Deleted";
	}

}
