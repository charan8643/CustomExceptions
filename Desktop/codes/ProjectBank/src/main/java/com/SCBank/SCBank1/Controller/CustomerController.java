package com.SCBank.SCBank1.Controller;

import com.SCBank.SCBank1.Repository.CustomerRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SCBank.SCBank1.Entity.Customer;
import com.SCBank.SCBank1.Service.CustomerService;

@RestController
@RequestMapping("/SC")

public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;  // Bussiness logic gets called

//	CustomerController(SCBank.SCBank1.Repository.CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	@PostMapping("/add")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("d/{id}")
	public Customer getCustomerById(int id) {
		return customerService.getCustomerById(id);
						
	}
	
	@GetMapping("/all")
	public List<Customer> getAll(){
		
		return customerService.getAllCustomers();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteid(@PathVariable("id")int id){
		
		return customerService.deleteById(id);
	}
	
	@PutMapping("/put")
	public 
	

}
