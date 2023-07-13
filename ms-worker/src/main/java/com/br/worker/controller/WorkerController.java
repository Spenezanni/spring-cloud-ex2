package com.br.worker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.worker.model.Worker;
import com.br.worker.service.impl.WorkerServiceImpl;

@RestController
@RequestMapping("/workers")
public class WorkerController {
	
	@Autowired
	private WorkerServiceImpl workerService;
	
	@GetMapping
	public ResponseEntity<List<Worker>> getListWorkers() {
		
		return ResponseEntity.ok(workerService.getListWorkers());
	}

}




