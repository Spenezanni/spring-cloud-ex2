package com.br.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.worker.model.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
