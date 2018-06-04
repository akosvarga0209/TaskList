package com.therealdanvega;

import com.therealdanvega.repository.TaskRepository;
import com.therealdanvega.service.TaskService;
import com.therealdanvega.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication implements CommandLineRunner {

    TaskService taskService;

    @Autowired
    public TasksApplication(TaskService taskService) {

        this.taskService = taskService;
    }

    public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);


	}

    @Override
    public void run(String... args) throws Exception {
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
        taskService.save(new Task("Tesztelek",LocalDate.now(),false));
    }

}
