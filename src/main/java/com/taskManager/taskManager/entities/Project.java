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
@NoArgsConstructor
@Table(name = "project_details")
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectId;
	private String projectName;
	private String projectDescription;
	private Date createdAt;
	
//	public Project() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Project(long projectId, String projectName, String projectDescription, Date date) {
//		super();
//		this.projectId = projectId;
//		this.projectName = projectName;
//		this.projectDescription = projectDescription;
//		this.createdAt = date;
//	}
//
//	public String getProjectName() {
//		return projectName;
//	}
//
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//
//	public String getProjectDescription() {
//		return projectDescription;
//	}
//
//	public void setProjectDescription(String projectDescription) {
//		this.projectDescription = projectDescription;
//	}
//
//
//	public long getProjectId() {
//		return projectId;
//	}
//
//	public void setProjectId(long projectId) {
//		this.projectId = projectId;
//	}
//
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	@Override
//	public String toString() {
//		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription=" + projectDescription
//				+ ", createdAt=" + createdAt + "]";
//	}

}
