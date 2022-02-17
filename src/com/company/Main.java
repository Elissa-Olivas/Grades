package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //String studentName, String className1, String className2, String className3, int grade, int grade2, int grade3
        Person1 person1 = new Person1("Bob", "Math", "English", "Science", 89, 95, 78);
        Person2 person2= new Person2("LaiLanni", "Math", "Endlish", "Science", 99, 72, 86);

        // add an array for multiple classes
        //String[] classes= {"math", "spanish", "English", "Science", "Band", "History"};
        //student.setStudentName("Bob");
        //student.setClassName("Math");


        //Student to name a class and enter their grade for each class
        //Scanner nameOfClass = new Scanner(System.in);
        //for (String nameOfClasses: classes) {
            //System.out.print("Please Enter a Class: ");
            //classes = nameOfClasses.nextLine();
        //}

    person1.describeStudent();
    person2.describeStudent();

    System.out.print("Who got the better grade in Math?\n");
    if (person1.getGrade() > person2.getGrade()) {
        System.out.println(person1.getStudentName() + "got the better grade");
    } else {
        System.out.println(person2.getStudentName() + "got the better grade");
    }
    /*old code:
        Scanner grade = new Scanner(System.in);
             System.out.println("Please enter your grade:  ");
        int num1 = grade.nextInt();

    if (num1 >= 90) {
        System.out.println("A");
    } else if (num1 >= 80 && num1 <= 89){
            System.out.println("B");
        } else if (num1 >= 70 && num1 <= 79) {
        System.out.println("C");
        } else if (num1 >= 60 && num1 <=69) {
        System.out.println("D");
        } else {
        System.out.println("F");
        } */
    }
}
