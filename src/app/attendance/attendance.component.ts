import { Component, OnInit } from '@angular/core';
import { StudentService } from '../services/student.service';
import { Student } from '../services/student.types';
import { ColDef, GridApi, GridReadyEvent } from 'ag-grid-community';


@Component({
  selector: 'app-attendance',
  templateUrl: './attendance.component.html',
  styleUrls: ['./attendance.component.css']
})
export class AttendanceComponent implements OnInit {
  students: Student[] = [];
  gridApi!: GridApi;

  fullNameGetter(params: any) {
    return params.data.firstName + " " + params.data.lastName;
  }

  colDefs: ColDef[] = [
    {
      headerName: "Student name",
      field: "firstName&lastName",
      filter: true,
      sortable: true,
      width: 225, 
      valueGetter: this.fullNameGetter,
    },
    {
      headerName: "Roll Number",
      field: "rollNumber",
      filter: true,
      sortable: true,
      width: 225,
    },
    // {
    //   headerName: "Mark Attendance",
    //   colId: "attendance",
    //   cellRenderer: () => {
    //     // Create 2 radio button to mark attendance
    //     return `<div> 
    //       <input type="radio" name="attendance" value="present"> Present
    //       <input type="radio" name="attendance" value="absent"> Absent
    //     </div>`
    //   }
    // }
  ]

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.studentService.getStudents().subscribe((students) => {
      this.students = students;
      console.log(this.students);
    });
  }

  onGridReady(params: GridReadyEvent) {
    this.gridApi = params.api;

    this.gridApi.sizeColumnsToFit();

    this.gridApi.setRowData(this.students);
  }


  onSubmit() {
    
  }
}
