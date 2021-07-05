package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ThisIsEntity;
import com.example.demo.repository.ThisIsRepository;



	@Service
	public class ThisIsService {
		@Autowired
		private ThisIsRepository repository;

		
		public String add(ThisIsEntity entity) {
		
			entity.setId(entity.getId());
			entity.setName(entity.getName());
			entity.setPhone(entity.getPhone());
			repository.save(entity);
			return "ok";
		}
		public void delete(ThisIsEntity entity) {
			
			repository.deleteById(entity.getId());
			
		}
		public void update(ThisIsEntity entity) {
			entity.setId(entity.getId());
			entity.setName(entity.getName());
			entity.setPhone(entity.getPhone());
			repository.save(entity);
			
		}
		public  Optional<ThisIsEntity> find(ThisIsEntity entity) {
			//自定義尋找name
			System.out.println(repository.findByUsername("d"));
		
			//一定要return，不然東西沒辦法傳回去
			return repository.findById(entity.getId());
		}
		
		
		
}
