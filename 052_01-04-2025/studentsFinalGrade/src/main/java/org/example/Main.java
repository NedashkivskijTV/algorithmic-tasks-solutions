package org.example;

import org.example.model.StudentFinalGrade;

public class Main {
    public static void main(String[] args) {
        System.out.println(StudentFinalGrade.finalGrade(100, 12)); //100
        System.out.println(StudentFinalGrade.finalGrade(99, 0)); //100
        System.out.println(StudentFinalGrade.finalGrade(10, 15)); //100

        System.out.println(StudentFinalGrade.finalGrade(85, 5)); //90

        System.out.println(StudentFinalGrade.finalGrade(55, 3)); //75

        System.out.println(StudentFinalGrade.finalGrade(55, 0)); //0
        System.out.println(StudentFinalGrade.finalGrade(20, 2)); //0
    }
}
