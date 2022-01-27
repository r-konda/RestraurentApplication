package com.example.demo.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.model.MorningMenu;
import com.example.demo.service.MorningMenuService;


@Controller
public class MorningMenuController 
{
	
	 @Autowired
	 private MorningMenuService morningMenuService;
	 
	 @GetMapping("/morning")
	 public String viewHomePage(Model model)
	 {
		 
	    model.addAttribute("morningList", morningMenuService.getAllMorningMenuList());
	    return "morning"; 
	 }
	 
	
	
	

}
