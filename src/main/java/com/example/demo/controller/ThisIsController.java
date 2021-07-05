package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ThisIsEntity;
import com.example.demo.service.ThisIsService;

//宣告是controller
@Controller
public class ThisIsController {
	// autowired 自動綁定
	@Autowired
	ThisIsEntity entity;
	@Autowired
	ThisIsService service;

	/*
	 * src/main/resources底下的templates裡面index.html需要用return來呼叫 底下的static 裡面要用網址呼叫
	 *
	 * @ModelAttribute:出現在方法參數中時，它會自動將form表單或URL裏的屬性傳給對象，
	 * 只要欲傳遞的屬性名在POJO類和前端表單name中對應即可。
	 */
	@GetMapping("/")
	@ResponseBody
	public String hi() {
		return "index";
	}

	@GetMapping("/add")
	@ResponseBody
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

	@PostMapping(value = "/show")
	public String find(Model model, ThisIsEntity entity) {
		Optional<ThisIsEntity> xx = service.find(entity);
		model.addAttribute("tt", xx.get());
		return "show";
	}
}
