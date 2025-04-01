package org.example.model;

// https://www.codewars.com/kata/5ad0d8356165e63c140014d4/train/java

public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
        if (exam > 90 || projects > 10) {
            return 100;
        }
        if (exam > 75 && projects >= 5) {
            return 90;
        }
        if (exam > 50 && projects >= 2) {
            return 75;
        }
        return 0;
    }
}


/*
        return (exam > 90 || projects > 10) ? 100 :
               (exam > 75 && projects > 4)  ? 90  :
               (exam > 50 && projects > 1)  ? 75  : 0;
 */