package com.therealdanvega.controller;

import com.therealdanvega.domain.Task;
import com.therealdanvega.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {


    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {

        this.taskService = taskService;
    }

    @GetMapping(value= {"","/"})
    public Iterable<Task> list(){

        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        task.setDueDate(LocalDate.now());
        return taskService.save(task);
    }

}
