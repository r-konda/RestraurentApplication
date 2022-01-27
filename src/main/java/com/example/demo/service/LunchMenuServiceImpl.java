package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LunchMenu;
import com.example.demo.repository.LunchMenuRepo;


@Service
public class LunchMenuServiceImpl implements LunchMenuService
{
	@Autowired
	private LunchMenuRepo lunchMenuRepo;

	@Override
	public List<LunchMenu> getAllLunchMenuList() {
		
		return  lunchMenuRepo.findAll();
	}
	

}
