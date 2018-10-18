package com.gharbi.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gharbi.app.dao.ClientDaoImpl;
import com.gharbi.app.model.Client;



@RestController
public class RestClient {

	@Autowired
	private ClientDaoImpl impl;
	
	@GetMapping("/customer")
	public String getCustomers() {
		return "List of customers";
	}
	
	@GetMapping("/customers")
	public List<Client> getAll(){
		//return impl.getAll();
		return null;
	}
}
