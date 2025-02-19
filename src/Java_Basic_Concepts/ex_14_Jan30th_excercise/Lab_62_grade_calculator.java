package Java_Basic_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_62_grade_calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch = 'O';
        String str;
        System.out.println("Enter Your Score");
        int score = sc.nextInt();

        if(score<0 || score >100){
            System.out.println("Please enter the valid Score!");
        }
        else {
            if(score>=90 && score<100){
                str = "A+";
               System.out.println("Your Grade is "+str);
            } else if (score>=80 && score<90) {
                ch='A';
                System.out.println("Your Grade is " +ch);
            } else if (score>=70 && score<80) {
                ch = 'B';
                System.out.println("Your Grade is " +ch);
            } else if (score>=60 && score<70) {
                ch = 'C';
                System.out.println("Your Grade is " +ch);
            } else if (score>=50 && score<60) {
                ch = 'D';
                System.out.println("Your Grade is " +ch);
            } else if (score>=40 && score<50) {
                ch ='E';
                System.out.println("Your Grade is " +ch);
            } else {
                ch ='F';
                System.out.println("Your Grade is " +ch);
            }

        }


    }
}
