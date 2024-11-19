package com.taskManager.taskManager.services;

import java.util.List;
import java.util.Optional;

import com.taskManager.taskManager.entities.Task;


public interface TaskService {

	Task addtask(Task task);

    List<Task> getalltask();

    Optional<Task> gettaskbyid(int id);

	String deletetask(int id);

	String updateTask(Task task);

	String updatetaskbyid(int id, Task task);

//	List<Task> findByStatus(String status);

}
