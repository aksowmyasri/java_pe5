package com.stackroute.exercise5;
//pojo class of student
public class Student {
    int studentID;
    String studentName;
    int studentAge;

    public Student(){}
    public Student(int studentID, String studentName, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" +studentID+
                ", studentName='" +studentName+ '\'' +
                ", studentAge="+studentAge+
                '}';
    }
}
