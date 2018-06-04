package com.therealdanvega.service;

import com.therealdanvega.domain.Task;
import org.springframework.stereotype.Service;


public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
