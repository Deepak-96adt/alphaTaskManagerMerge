package com.taskManager.taskManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

//	@GetMapping("/getProjectById/{projectId}")
//	public Project getProject(@PathVariable String projectId){
//		return this.projectService.getProjectById(Long.parseLong(projectId));
//	}

	
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) {
		return this.projectService.addProject(project);
	}
	
	@PatchMapping("/updateProject/{projectId}")
	public String updateProject(@PathVariable String projectId , @RequestBody Project project) {
		return this.projectService.updateProjectById(Long.parseLong(projectId) , project);
	}
}
