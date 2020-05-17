package com.example.demo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Demo;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Integer>{

	@Query("select * from demo;")
	public List<Demo> selectAll();
	
	
	@Query("select * from demo where id = :id")
	public Demo selectById(@Param("id")Integer id);
	
}
