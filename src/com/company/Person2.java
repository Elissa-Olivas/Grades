package com.company;

public class Person2 {
    private String studentName;
    private String className1;
    private String className2;
    private String className3;
    private int grade;
    private int grade2;
    private int grade3;

    public Person2(String studentName, String className1, String className2, String className3, int grade, int grade2, int grade3) {
        this.studentName = studentName;
        this.className1= className1;
        this.className2= className2;
        this.className3= className3;
        this.grade = grade;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    //set and get all classNames
    public void setClassName1(String className1) {
        this.className1 = className1;
    }
    public String getClassName1 () {
        return className1;
    }
    public void setClassName2(String className2) {
        this.className2 = className2;
    }
    public String getClassName2 () {
        return className2;
    }
    public void setClassName3(String className3) {
        this.className3 = className3;
    }
    public String getClassName3 () {
        return className3;
    }

    //set and get all grades

    public void setGrade (int grade) {
        this.grade= grade;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade2 (int grade2) {
        this.grade2= grade2;
    }
    public int getGrade2() {
        return grade2;
    }
    public void setGrade3 (int grade3) {
        this.grade3= grade3;
    }
    public int getGrade3() {
        return grade3;
    }


    public void setStudentName (String nameOfStudent) {
        studentName = nameOfStudent;
    }

    public String getStudentName () {
        return studentName;
    }

    //method
    public void describeStudent() {
        System.out.println("Student: " + getStudentName() + ", " + getClassName1() + ": " + getGrade() +
                ", " + getClassName2() + ": " + getGrade2() + ", " + getClassName3() + ": " + getGrade3());
    }
    public void gradeAverage() {
        System.out.println("The student's grade point average is " + ((getGrade() + getGrade2() + getGrade3())/3));
    }
}
