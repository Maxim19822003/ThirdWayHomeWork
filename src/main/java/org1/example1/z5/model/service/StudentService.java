package org1.example1.z5.model.service;

import org1.example1.z5.model.Student;
import org1.example1.z5.model.User;

import java.util.List;
public interface StudentService {
    Student create(User user);
    List<Student> read();
}
