package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.DinnerMenu;

public interface DinnerMenuService {
	public List<DinnerMenu> getAllList();
}
