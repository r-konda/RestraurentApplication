package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.LunchMenuService;


@Controller
public class LunchMenuController 
{
	@Autowired
	 private LunchMenuService lunchMenuService;
	 
	 @GetMapping("/lunch")
	 public String viewHomePage(Model model)
	 {
		 
	    model.addAttribute("lunchList", lunchMenuService.getAllLunchMenuList());
	    return "lunch"; 
	 }

}
