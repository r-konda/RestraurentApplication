package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DinnerMenuService;

@Controller
public class DinnerControler {
	
	@Autowired
	private DinnerMenuService dinnerService;
	
	 @GetMapping("/dinner")
	 public String viewHomePage(Model model)
	 {
		 
	    model.addAttribute("dinnerList", dinnerService.getAllList());
	    return "dinner"; 
	 }

}
