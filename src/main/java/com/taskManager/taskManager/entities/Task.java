package com.taskManager.taskManager.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
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
	private Date deadline;
	private int projectId;

}
