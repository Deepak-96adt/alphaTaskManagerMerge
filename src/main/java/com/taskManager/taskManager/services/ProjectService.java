package com.taskManager.taskManager.services;
import com.taskManager.taskManager.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

	/**
		 Retrieve List of all projects.
	*/
	List<Project> getProjects();


	/**
		 Add a new project.
	 */
	Project addProject(Project project);

	/**
	     Delete a project by its ID.
	 */
	String deleteProject(int projectId);

	/**
	 	 Update a project by its ID.
	*/
	String updateProjectById(int projectId, Project project);
}
