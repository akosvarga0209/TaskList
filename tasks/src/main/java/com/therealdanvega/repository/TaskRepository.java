package com.therealdanvega.repository;

import com.therealdanvega.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {



}
