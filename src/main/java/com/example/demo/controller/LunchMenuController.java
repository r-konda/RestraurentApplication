package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.LunchMenuService;

/*
 * Here @Controller annotation role is create a map of model object and find a view
 */
@Controller
public class LunchMenuController 
{
	/*
	 * @Autowired annotation enables you to inject the object dependency implicitly
	 */
	@Autowired
	 private LunchMenuService lunchMenuService;
	/*
	 * load the lunch Menu page
	 */
	 @GetMapping("/lunch")
	 public String viewHomePage(Model model)
	 {
		 
	    model.addAttribute("lunchList", lunchMenuService.getAllLunchMenuList());
	    return "lunch"; 
	 }

}
