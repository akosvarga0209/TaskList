export class Task {
     public id: number;
     public name : string;
     public completed : boolean;
     private _dueDate : string;

     constructor(name: string, completed: boolean, dueDeate: string){
          this.name=name;
          this.completed=completed;
          this._dueDate=dueDeate;
     }

}
