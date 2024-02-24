package org1.example1.z5.model.controller;

import org1.example1.z5.model.Student;
import org1.example1.z5.model.StudyGroup;
import org1.example1.z5.model.Teacher;
import org1.example1.z5.model.service.DataStudentService;
import org1.example1.z5.model.service.DataTeacherService;
import org1.example1.z5.model.service.StudyGroupService;

import java.util.List;

public class Controller {
    private final DataStudentService dataStudentService;
    private final DataTeacherService dataTeacherService;
    private final StudyGroupService studyGroupService;

    public Controller() {
        dataStudentService = new DataStudentService();
        dataTeacherService = new DataTeacherService();
        studyGroupService = new StudyGroupService();
    }

    public void start() {
        Student student1 = new Student(21, "Юрий", 4.5);
        Student student2 = new Student(22, "Сергей", 4.0);
        Teacher teacher = new Teacher(40, "Петр", "Математика");

        Student createdStudent1 = createStudent(student1);
        Student createdStudent2 = createStudent(student2);
        Teacher createdTeacher = createTeacher(teacher);

        List<Student> students = dataStudentService.read();
        StudyGroup studyGroup = studyGroupService.createStudyGroup(createdTeacher, students);
        System.out.println(studyGroup);
    }

    public Student createStudent(Student student) {
        return dataStudentService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return dataTeacherService.create(teacher);
    }
}
