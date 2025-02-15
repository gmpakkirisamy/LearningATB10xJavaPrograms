package ex_08_If_Else_Statement;

import java.util.Scanner;

public class Lab_34_grade_calculator {
    public static void main(String[] args) {
        System.out.println("Enter the total mark scored:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = 'F'; // Assiging the default value to the grade

        if(score>=90 && score <=100) {
            grade = 'A';
        }
        else if(score>=80 && score <=89) {
            grade = 'B';
        }
        else if(score>=70 && score <=79) {
            grade = 'C';
        }
        else if(score>=60 && score <=69) {
            grade = 'D';
        }
        else if(score <= 0 || score >=100) {
            grade = 'O';
            System.out.println("Entered Score is not valid ! Please recheck and enter the Score!");
        }
        else {
            grade = 'F';
        }
        System.out.println(grade);
        sc.close();
    }
}
