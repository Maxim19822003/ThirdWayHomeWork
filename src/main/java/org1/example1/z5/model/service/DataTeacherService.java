package org1.example1.z5.model.service;

import org1.example1.z5.model.Teacher;
import org1.example1.z5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacherService implements TeacherService {
    List<Teacher> listTeachers = new ArrayList<>();
    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(listTeachers.size() + 1);
        listTeachers.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return listTeachers;
    }
}
