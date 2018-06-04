import { Component, OnInit } from '@angular/core';
import {TaskService} from "../task.service";
import {Task} from '../task.model';
import {FormGroup, NgForm} from "@angular/forms";

@Component({
  selector: 'app-tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {

     addTaskValue: string = null;

  constructor(private taskService: TaskService) { }

  ngOnInit() {
  }

  onTaskAdd(form: NgForm) {
       let task: Task = new Task(form.value['name'], false, new Date().toString());
       this.taskService.addTask(task)
            .subscribe(
                 (newTask: Task) => {
                      //clear the input
                      this.addTaskValue = '';
                      this.taskService.onTaskAdded.next(newTask);
                      console.log(task);

                 }
            )
  }

}
