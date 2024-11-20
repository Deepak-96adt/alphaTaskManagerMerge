//package com.taskManager.taskManager.services;
//
//import java.util.List;
//
//import com.taskManager.taskManager.entities.Project;
//
//public interface ProjectService {
//
//	public List<Project> getProjects();
//
//	//	public Project getProjectById(long projectId);
//
//	public Project addProject(Project project);
//
//	public String deleteProject(long projectId);
//
//	public String updateProjectById(long projectId , Project project);
//
//
//}


package com.taskManager.taskManager.services;
import com.taskManager.taskManager.entities.Project;
import java.util.List;

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
	 * Delete a project by its ID.
	 */
	String deleteProject(Long projectId);

	/**
	 * Update a project by its ID.
	 *
	 * @param projectId ID of the project to update.
	 * @param project   The updated project details.
	 * @return A message indicating the result of the operation.
	 */
	String updateProjectById(Long projectId, Project project);
}
