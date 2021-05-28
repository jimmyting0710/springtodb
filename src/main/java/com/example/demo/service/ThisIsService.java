package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ThisIsEntity;
import com.example.demo.repository.ThisIsRepository;



	@Service
	public class ThisIsService {
		@Autowired
		private ThisIsRepository repository;

		
		public void add(ThisIsEntity entity) {
		
			entity.setId(entity.getId());
			entity.setName(entity.getName());
			entity.setPhone(entity.getPhone());
			repository.save(entity);
			
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
		public void find(ThisIsEntity entity) {
			repository.findById(entity.getId());
		}
		
}
