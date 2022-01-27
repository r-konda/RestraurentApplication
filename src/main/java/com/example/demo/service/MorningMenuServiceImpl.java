package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MorningMenu;
import com.example.demo.repository.MorningMenuRepo;


@Service
public class MorningMenuServiceImpl implements MorningMenuService
{
	@Autowired
	private MorningMenuRepo morningMenuRepo;

	@Override
	public List<MorningMenu> getAllMorningMenuList() {
		return  morningMenuRepo.findAll();
	}

}
