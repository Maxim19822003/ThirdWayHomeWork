package org1.example1.z5.model;


public class Student extends User {
    private Integer studentId;
    private Double average;

    public Student(Integer age, String name, Double average) {
        super(age, name);
        this.average = average;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", average=" + average +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}