package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ThisIsEntity;
//宣告為repository

@Repository
public interface ThisIsRepository extends CrudRepository<ThisIsEntity, Integer>{
	//自增定義用name尋找
	//select name跟*不一樣
	@Query(value="select name from test where name=?1",nativeQuery=true)
	 String findByUsername(String name);
}

