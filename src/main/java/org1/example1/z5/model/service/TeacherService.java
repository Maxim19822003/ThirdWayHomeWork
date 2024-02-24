package org1.example1.z5.model.service;

import org1.example1.z5.model.Teacher;
import org1.example1.z5.model.User;

import java.util.List;

public interface TeacherService {
    Teacher create(User user);
    List<Teacher> read();
}
