package org1.example1.z5.model.view;

import org1.example1.z5.model.Student;

import java.util.List;

public class StudentView {
    public void PrintStudent(List<Student> studentList) {
        System.out.println("Все студенты: " + "\n" + studentList);
    }

}
