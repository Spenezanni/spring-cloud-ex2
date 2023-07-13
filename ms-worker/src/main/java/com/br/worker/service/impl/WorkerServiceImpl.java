package com.br.worker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.worker.model.Worker;
import com.br.worker.repository.WorkerRepository;
import com.br.worker.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public List<Worker> getListWorkers() {
		return workerRepository.findAll();
		
	}

}
