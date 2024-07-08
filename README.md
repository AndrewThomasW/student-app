Student App

A simple Java model class for managing student information.

Overview
This project contains a basic Student class to represent student data. The class includes fields for student ID and name, along with appropriate getters and setters.

package com.example.studentapp.model;

public class Student {

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}



Features
1. Student ID: Unique identifier for each student.
2. Student Name: Name of the student.


Usage
1. Create a Student Object
2. Get Student Information
3. Set Student Information

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contributing
Contributions are welcome! Please open an issue or submit a pull request with any improvements or suggestions.
