package com.alphaTaskManager.alphaTaskManager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alphaTaskManager.alphaTaskManager.Entity.Task;
import com.alphaTaskManager.alphaTaskManager.Repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	@Override
	public List<Task> addtask(List<Task> task) {
		return taskRepository.saveAll(task);
	}
	
	@Override
	public List<Task> getalltask() {
		return taskRepository.findAll();
	}

	@Override
	public Optional<Task> gettaskbyid(int id) {
		return taskRepository.findById(id);
	}

	@Override
	public String deletetask(int id) {
		 Optional<Task> byId = taskRepository.findById(id); 
		 if(byId.isPresent()) {
			 taskRepository.deleteById(id);
			 return "Deleted task successfully";
		 }else {
			 return "Not found";
		 }
	}

	@Override
	public String updateTask(Task task) {
		Optional<Task> ById = taskRepository.findById(task.getTaskId());
		if(ById.isPresent()) {
			taskRepository.save(task);
			return "Updated successfully";
		}else {
			return "Not found";
		}
	}

	@Override
	public String updatetaskbyid(int id, Task task) {
		Optional<Task> ById = taskRepository.findById(id);
		if(ById.isPresent()) {
			ById.get().setStatus(task.getStatus());
			return "Updated successfully";
		}else {
			return "Not found";
		}
	}

}
