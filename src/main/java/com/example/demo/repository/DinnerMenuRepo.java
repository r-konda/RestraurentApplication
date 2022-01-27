package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DinnerMenu;

@Repository
public interface DinnerMenuRepo extends JpaRepository<DinnerMenu, Long>
{
	

}
