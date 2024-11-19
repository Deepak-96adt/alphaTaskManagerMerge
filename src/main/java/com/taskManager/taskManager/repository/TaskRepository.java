package com.taskManager.taskManager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taskManager.taskManager.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

//	   public List<Task> findByStatus(String status);	
	  
	   @Query(nativeQuery = true, value = "SELECT * FROM task_details t  where t.status=:status ORDER BY t.status")
	   public List<Task> findAllSortedByStatus(String status);
	   
	   @Query(nativeQuery = true, value = "SELECT * FROM task_details t  where t.task_id=:taskId ORDER BY t.task_id")
	   public List<Task> findAllSortedById(int taskId);
}
