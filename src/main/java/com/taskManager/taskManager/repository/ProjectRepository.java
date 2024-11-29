package com.taskManager.taskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.taskManager.entities.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
}
