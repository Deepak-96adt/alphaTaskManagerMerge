package com.taskManager.taskManager.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.taskManager.taskManager.entities.Task;
import com.taskManager.taskManager.repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	@Override
	public Task addtask(Task task) {
			Date date= new Date();
			task.setCreatedAt(date);
			return taskRepository.save(task);
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
			Date date = new Date();
			task.setUpdatedAt(date);
			taskRepository.save(task);
			return "Updated successfully";
		}else {
			return "Not found";
		}
	}

//	@Override
//	public String updatetaskbyid(int id, Task task) {
//		Optional<Task> ById = taskRepository.findById(id);
//		if(ById.isPresent()) {
//			ById.get().setStatus(task.getStatus());
//			Date date = new Date();
//			ById.get().setUpdatedAt(date);
//			return "Updated successfully";
//		}else {
//			return "Not found";
//		}
//	}

}
