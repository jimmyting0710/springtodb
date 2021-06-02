package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ThisIsEntity;
//宣告為repository

@Repository
public interface ThisIsRepository extends CrudRepository<ThisIsEntity, Integer>{

}
