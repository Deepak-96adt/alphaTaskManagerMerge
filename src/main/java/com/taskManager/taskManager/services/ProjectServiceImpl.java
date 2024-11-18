package com.taskManager.taskManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskManager.taskManager.entities.Project;
import com.taskManager.taskManager.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

//	@Override
//	public Project getProjectById(long projectId) {
//		return projectDao.getOne(projectId);
//	}

	@Override
	public Project addProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public String updateProjectById(long projectId , Project projectObj) {
		Optional<Project> project = projectRepository.findById(projectId);
		if (project.isPresent()) {
			if (projectObj.getProjectName()!=null) {				
				project.get().setProjectName(projectObj.getProjectName());
			}
			
			if (projectObj.getProjectDescription()!=null) {				
				project.get().setProjectDescription(projectObj.getProjectDescription());
			}
			return "project updated successfully , name = "+projectObj.getProjectName()+", desc = "+projectObj.getProjectDescription();
		}
		else {
			return "something went wrong !!";
		}
		
	}

}
