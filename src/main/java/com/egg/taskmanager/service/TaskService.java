package com.egg.taskmanager.service;

import com.egg.taskmanager.model.Task;
import com.egg.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    
}
