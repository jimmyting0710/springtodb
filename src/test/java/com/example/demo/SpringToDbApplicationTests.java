package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.entity.ThisIsEntity;
import com.example.demo.service.ThisIsService;

@AutoConfigureMockMvc
@SpringBootTest
//@WebMvcTest(ThisIsController.class)
class SpringToDbApplicationTests {
	@Autowired
	MockMvc mockmvc;
	@Autowired
	ThisIsService service;

	@Test
	void contextLoads() throws Exception {
		ThisIsEntity entity = new ThisIsEntity();
		entity.setId(8);
		entity.setName("g");
		entity.setPhone("09");
		service.add(entity);
		mockmvc.perform(get("/index"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON));
			.assert
	}

}
