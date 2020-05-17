package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;

@RestController
@RequestMapping("/demo/rest")
public class DemoRestController {

	@Autowired
	private DemoRepository repository;

	@GetMapping
	public List<Demo> getAll() {
		return repository.selectAll();
	}

}
