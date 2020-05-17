package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Demo;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoRepository repository;
	
	
	@GetMapping("/{id}")
	public String demo(@PathVariable("id") Integer id, Model model) {
		Demo demo = repository.selectById(id);
		model.addAttribute("demo", demo);
		return "demo.html";
	}
}
