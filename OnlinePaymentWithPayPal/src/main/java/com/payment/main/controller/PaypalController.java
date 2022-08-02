package com.payment.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.payment.main.services.PayPalServices;

@Controller
public class PaypalController {

	@Autowired
	private PayPalServices service;

	
	@GetMapping("/") 
	
	public String home() {
		return "home";
	}
}
