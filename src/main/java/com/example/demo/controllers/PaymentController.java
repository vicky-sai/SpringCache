package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService service;
	
	
	@GetMapping("/find/{key}")
	public Payment findById(@PathVariable("key") long key) throws InterruptedException {
		
		return this.service.findById(key);
	}
	
	@GetMapping("/find/{key}/{updateAmount}")
	public Payment findById(@PathVariable("key") long key,@PathVariable("updateAmount") long updateAmount) throws InterruptedException {
		
		return this.service.update(key,updateAmount);
	}
}
