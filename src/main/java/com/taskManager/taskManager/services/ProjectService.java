package com.taskManager.taskManager.services;

import java.util.List;

import com.taskManager.taskManager.entities.Project;

public interface ProjectService {
	
	public List<Project> getProjects();

	//	public Project getProjectById(long projectId);

	public Project addProject(Project project);

	public String deleteProject(long projectId);

	public String updateProjectById(long projectId , Project project);
	
	
}
