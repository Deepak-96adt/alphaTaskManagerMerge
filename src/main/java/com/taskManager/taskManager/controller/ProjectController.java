package com.taskManager.taskManager.controller;
import com.taskManager.taskManager.entities.Project;
import com.taskManager.taskManager.services.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
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
	public ResponseEntity<String> addProject(@Valid @RequestBody Project project , BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().body(bindingResult.getAllErrors().get(0).getDefaultMessage());
		}
		projectService.addProject(project);
		return ResponseEntity.status(201).body("Project added successfully");
	}

	@PatchMapping("/{projectId}")
	public ResponseEntity<String> updateProject(
			@PathVariable int projectId,
			@Valid @RequestBody Project project) {
		String result = projectService.updateProjectById(projectId, project);
		return ResponseEntity.ok(result);
	}

	@DeleteMapping("/{projectId}")
	public ResponseEntity<String> deleteProject(@PathVariable int projectId) {
		String result = projectService.deleteProject(projectId);
		return ResponseEntity.ok(result);
	}
}
