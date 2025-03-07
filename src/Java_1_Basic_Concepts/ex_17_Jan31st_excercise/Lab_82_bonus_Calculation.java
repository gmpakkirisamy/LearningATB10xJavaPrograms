package Java_1_Basic_Concepts.ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_82_bonus_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bonus = 0L;
        long sal =0L;
        System.out.println("Enter the total number of year of experiance you have !");
        int exp = sc.nextInt();;
        System.out.println("Enter your salary now!");
        sal = sc.nextLong();;
        if(exp<0 || exp>=58 && sal<0) {
            System.out.println("Invalid Age or Salary. Please enter the correct value");
        } else {
            if(exp<=1){
                System.out.println("Sorry, Based on your years of experiance you are not elligible for bonous!");
            } else if (exp>1 && exp<=3) {
                bonus = (long) (sal + sal*0.05);
                System.out.println("Your Salary Including Bonus is "+bonus);
            } else if (exp>3 && exp<=6) {
                bonus = (long) (sal + sal*0.1);
                System.out.println("Your Salary Including Bonus is "+bonus);
            } else {
                bonus = (long) (sal + sal*0.15);
                System.out.println("Your Salary Including Bonus is "+bonus);
            }
        }
    }
}
