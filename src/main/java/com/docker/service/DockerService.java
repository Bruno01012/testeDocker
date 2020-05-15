package com.docker.service;

import com.docker.dto.CategoryDTO;

public interface DockerService {
	
	boolean add(CategoryDTO request);
}
