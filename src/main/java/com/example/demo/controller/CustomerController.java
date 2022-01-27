package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Customer;
import com.example.demo.model.MorningMenu;
import com.example.demo.repository.CustomerRepo;

@Controller
public class CustomerController {
	@Autowired
	CustomerRepo customerRepo;

	@RequestMapping("/")
	public String customerPage() {
		return "customer";
	}

	@PostMapping("/saveData")
	public String saveData(Customer customer) {
		
		customerRepo.save(customer);
		return "redirect:/home";

	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/checkButtons")
	public String checkButtons(@RequestParam String one) {
		if (one != null && one.equalsIgnoreCase("MorningMenu")) {
			return "redirect:/morning";
		} else if (one != null && one.equalsIgnoreCase("LunchMenu")) {
			return "redirect:/lunch";
		} else if (one != null && one.equalsIgnoreCase("DinnerMenu")) {
			return "redirect:/dinner";
		} else {
			return "redirect:/home";
		}
	}
	
	@RequestMapping("/calculation")
	public void getAllValues(@RequestParam String[] selected)
	{
		System.out.println("Rare :: "+Arrays.toString(selected));
	}

}
