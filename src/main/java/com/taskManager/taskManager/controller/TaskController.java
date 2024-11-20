package com.taskManager.taskManager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskManager.taskManager.entities.Task;
import com.taskManager.taskManager.repository.TaskRepository;
import com.taskManager.taskManager.services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private TaskRepository taskRepo;
	
	@PostMapping
	public Task addTask(@RequestBody Task task){
		return taskService.addtask(task);
	}
	
	@GetMapping
	public List<Task> getAllTask(){
		return taskService.getalltask();
	}
	
//	@GetMapping("/get/{id}")
//	public Optional<Task> getTaskById(@PathVariable int id){
//		return taskService.gettaskbyid(id);
//	}
	
	@GetMapping("/{id}")
	public List<Task> getTaskById(@PathVariable int id){
		return taskRepo.findAllSortedById(id);
	}
	
	@GetMapping("/getbystatus/{status}")
	public List<Task> getTaskByStatus(@PathVariable String status){
		return taskRepo.findAllSortedByStatus(status);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable int id) {
		return taskService.deletetask(id);
	}
	
	@PutMapping
	public String updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
//	@PatchMapping("/updatebyid/{id}")
//	public String updateTaskById(@PathVariable int id, @RequestBody Task task) {
//		return taskService.updatetaskbyid(id,task);
//	}
}
