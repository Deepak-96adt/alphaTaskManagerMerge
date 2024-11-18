package com.alphaTaskManager.alphaTaskManager.Controller;

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

import com.alphaTaskManager.alphaTaskManager.Entity.Task;
import com.alphaTaskManager.alphaTaskManager.Repository.TaskRepository;
import com.alphaTaskManager.alphaTaskManager.Services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private TaskRepository taskRepo;
	
	@PostMapping("/add")
	public List<Task> addTask(@RequestBody List<Task> task){
		return taskService.addtask(task);
	}
	
	@GetMapping("/getalltask")
	public List<Task> getAllTask(){
		return taskService.getalltask();
	}
	
//	@GetMapping("/get/{id}")
//	public Optional<Task> getTaskById(@PathVariable int id){
//		return taskService.gettaskbyid(id);
//	}
	
	@GetMapping("/getbyid/{id}")
	public List<Task> getTaskById(@PathVariable int id){
		return taskRepo.findAllSortedById(id);
	}
	
	@GetMapping("/getbystatus/{status}")
	public List<Task> getTaskByStatus(@PathVariable String status){
		return taskRepo.findAllSortedByStatus(status);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTask(@PathVariable int id) {
		return taskService.deletetask(id);
	}
	
	@PutMapping("/update")
	public String updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
	@PatchMapping("/updatebyid/{id}")
	public String updateTaskById(@PathVariable int id, @RequestBody Task task) {
		return taskService.updatetaskbyid(id,task);
	}
}
