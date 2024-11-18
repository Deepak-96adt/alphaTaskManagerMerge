package com.taskManager.taskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskManager.taskManager.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
}
