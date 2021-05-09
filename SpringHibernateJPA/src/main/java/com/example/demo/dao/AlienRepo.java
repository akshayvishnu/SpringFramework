package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	public List<Alien> findByTech(String tech);
	public List<Alien> findByaIdGreaterThan(int aId);
	
	@Query("from Alien where tech=?1 order by aName")
	public List<Alien> findByTechSorted(String tech);
}
