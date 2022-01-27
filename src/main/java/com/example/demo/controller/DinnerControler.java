package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DinnerMenuService;

/*
 * Here @Controller annotation role is create a map of model object and find a view
 */
@Controller
public class DinnerControler 
{
	/*
	 * @Autowired annotation enables you to inject the object dependency implicitly
	 */
	@Autowired
	private DinnerMenuService dinnerService;
	
	/*
	 * load the dinner Menu page
	 */
	 @GetMapping("/dinner")
	 public String viewHomePage(Model model)
	 {
		 
	    model.addAttribute("dinnerList", dinnerService.getAllList());
	    return "dinner"; 
	 }

}
