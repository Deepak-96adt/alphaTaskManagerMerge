package com.alphaTaskManager.alphaTaskManager.Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task_details")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskId;
	private String taskTitle;
	private String taskDescription;
	private String status;
	private Date createdAt;
	private Date updatedAt;
	private int projectId;
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Task(int taskId, String taskTitle, String taskDescription, String status, Date createdAt, Date updatedAt,
			int projectId) {
		super();
		this.taskId = taskId;
		this.taskTitle = taskTitle;
		this.taskDescription = taskDescription;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.projectId = projectId;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
