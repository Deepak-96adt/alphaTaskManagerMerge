package com.taskManager.taskManager.controller;
import com.taskManager.taskManager.entities.Project;
import com.taskManager.taskManager.services.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/project")
@Validated
public class ProjectController {

	private final ProjectService projectService;

	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping
	public ResponseEntity<List<Project>> getAllProjects() {
		List<Project> projects = projectService.getProjects();
		return ResponseEntity.ok(projects);
	}

	@PostMapping
	public ResponseEntity<Project> addProject(@Valid @RequestBody Project project) {
		Project savedProject = projectService.addProject(project);
		return ResponseEntity.status(201).body(savedProject);
	}

	@PatchMapping("/{projectId}")
	public ResponseEntity<String> updateProject(
			@PathVariable Long projectId,
			@Valid @RequestBody Project project) {
		String result = projectService.updateProjectById(projectId, project);
		return ResponseEntity.ok(result);
	}

	@DeleteMapping("/{projectId}")
	public ResponseEntity<String> deleteProject(@PathVariable Long projectId) {
		String result = projectService.deleteProject(projectId);
		return ResponseEntity.ok(result);
	}
}
