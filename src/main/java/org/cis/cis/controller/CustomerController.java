package org.cis.cis.controller;



import java.util.List;

import org.cis.cis.model.Customer;
import org.cis.cis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/customer")
@Slf4j
@CrossOrigin(origins = "*",allowedHeaders = "*")

public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/findByName")
	public ResponseEntity <List<Customer>> findByName (@RequestBody String name){
		
		return new ResponseEntity <List<Customer>>(customerService.findByName(name),HttpStatus.OK);
	}
	
	
}
