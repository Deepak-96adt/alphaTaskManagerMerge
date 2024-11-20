package com.taskManager.taskManager.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "project_details")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectId;
	private String projectName;
	private String projectDescription;
	private Date createdAt;

}
