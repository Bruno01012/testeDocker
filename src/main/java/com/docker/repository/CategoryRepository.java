package com.docker.repository;

import org.springframework.data.repository.CrudRepository;

import com.docker.dto.CategoryDTO;

public interface CategoryRepository extends CrudRepository<CategoryDTO, String> {

}
