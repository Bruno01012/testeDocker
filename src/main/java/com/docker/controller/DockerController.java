package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dto.CategoryDTO;
import com.docker.service.DockerService;


@RestController
public class DockerController {

	@Autowired
	DockerService dockerService;

	@PostMapping("/add")
	public ResponseEntity<String> addDocker(CategoryDTO request){
		dockerService.add(request);
		return new ResponseEntity<String>("Atividade Cadastrada Com Sucesso", HttpStatus.OK);
	}

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()
	{
		return "{ \"isWorking\" : true }";
	}
}
