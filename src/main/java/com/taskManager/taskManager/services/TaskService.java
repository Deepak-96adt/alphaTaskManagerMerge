package com.alphaTaskManager.alphaTaskManager.Services;

import java.util.List;
import java.util.Optional;

import com.alphaTaskManager.alphaTaskManager.Entity.Task;


public interface TaskService {

	List<Task> addtask(List<Task> task);

    List<Task> getalltask();

    Optional<Task> gettaskbyid(int id);

	String deletetask(int id);

	String updateTask(Task task);

	String updatetaskbyid(int id, Task task);

//	List<Task> findByStatus(String status);

}
