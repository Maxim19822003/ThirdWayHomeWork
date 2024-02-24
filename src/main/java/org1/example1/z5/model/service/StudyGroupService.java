package org1.example1.z5.model.service;

import org1.example1.z5.model.Student;
import org1.example1.z5.model.StudyGroup;
import org1.example1.z5.model.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}

