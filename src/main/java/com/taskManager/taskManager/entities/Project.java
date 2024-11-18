package com.taskManager.taskManager.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_details")
public class Project {
	@Id
	private long project_id;
	private String project_name;
	private String project_description;
	private Date created_at;
	
	public Project() {
		super();
		
	}

	public Project(long project_id, String project_name, String project_description, Date date) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_description = project_description;
		this.created_at = date;
	}
	
	public String getProjectName() {
		return project_name;
	}

	public void setProjectName(String project_name) {
		this.project_name = project_name;
	}

	public String getProjectDescription() {
		return project_description;
	}

	public void setProjectDescription(String project_description) {
		this.project_description = project_description;
	}

	
	public long getProjectId() {
		return project_id;
	}

	public void setProjectId(long project_id) {
		this.project_id = project_id;
	}

	public Date getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(Date created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", project_description=" + project_description
				+ ", created_at=" + created_at + "]";
	}

}
