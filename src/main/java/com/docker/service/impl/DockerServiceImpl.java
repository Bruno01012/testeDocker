package com.docker.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.dto.CategoryDTO;
import com.docker.repository.CategoryRepository;

@Service
public class DockerServiceImpl {
		
	@Autowired
	CategoryRepository categoryRepository;
	
	public boolean add(CategoryDTO request) {
		try {
		String id = UUID.randomUUID().toString();
		CategoryDTO category = new CategoryDTO(id,request.getDescription());
		categoryRepository.save(category);
		return true;
		}catch(Exception e){
			return false;
		}
		
	}
}
