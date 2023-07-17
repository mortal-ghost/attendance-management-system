import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './student.types';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  headers = new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE',
    'Access-Control-Allow-Headers': 'Content-Type',
  });

  constructor(private _http: HttpClient) { }

  getStudents() {
    const url = "/api/students";
    return this._http.get<Student[]>(url, { headers: this.headers });
  }
}
