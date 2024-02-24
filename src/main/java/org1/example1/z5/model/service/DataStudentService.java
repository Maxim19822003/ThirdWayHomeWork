package org1.example1.z5.model.service;

import org1.example1.z5.model.Student;
import org1.example1.z5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudentService implements StudentService {
    List<Student> listStudents = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudents.size() + 1);
        listStudents.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudents;
    }
}
