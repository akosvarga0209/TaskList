package com.therealdanvega.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private boolean completed;

        public Task(){

        }



    public Task(String test, LocalDate now, boolean b) {
        this.name=test;
        this.dueDate=now;
        this.completed=b;
    }


    public void setDueDate(LocalDate date){
            this.dueDate = date;
    }
}
