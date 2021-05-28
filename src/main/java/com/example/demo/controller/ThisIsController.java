package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ThisIsEntity;
import com.example.demo.service.ThisIsService;

@Controller
public class ThisIsController {
	@Autowired
	ThisIsEntity entity;
	@Autowired
	ThisIsService service;

	@GetMapping("/")
	public String hi() {
		return "index";
	}

	@GetMapping("/add")
	public String hello(ThisIsEntity entity) {
		entity.getId();
		entity.getName();
		entity.getPhone();
		service.add(entity);
		return "index";
	}

	@GetMapping("/delete")
	public String delete(ThisIsEntity entity) {
		entity.getId();
		service.delete(entity);
		return "index";

	}
	@GetMapping("/update")
	public String update(ThisIsEntity entity) {
		entity.getId();
		entity.getName();
		entity.getPhone();
		service.update(entity);
		return "index";
	}
	
	
	@GetMapping("/find")
	public String find(ThisIsEntity entity) {
		entity.getId();
		entity.getName();
		entity.getPhone();
		service.update(entity);
		return "index";
	}
}
