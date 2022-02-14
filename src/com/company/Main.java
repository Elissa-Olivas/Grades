package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
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
        }
    }
}
