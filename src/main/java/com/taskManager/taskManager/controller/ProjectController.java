package com.taskManager.taskManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.taskManager.taskManager.entities.Project;
import com.taskManager.taskManager.services.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/getProjects")
	public List<Project> getProjects(){
		return this.projectService.getProjects();
	}

//	@GetMapping("/getProjectById/{projectId}")
//	public Project getProject(@PathVariable String projectId){
//		return this.projectService.getProjectById(Long.parseLong(projectId));
//	}
	
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) {
		return this.projectService.addProject(project);
	}
	
	@PatchMapping("/updateProjectById/{projectId}")
	public String updateProject(@PathVariable String projectId , @RequestBody Project project) {
		return this.projectService.updateProjectById(Long.parseLong(projectId) , project);
	}

	@DeleteMapping("/deleteProjectById/{projectId}")
	public String deleteProject(@PathVariable String projectId){return this.projectService.deleteProject(Long.parseLong(projectId));}

}
