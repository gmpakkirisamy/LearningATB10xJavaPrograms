package Java_1_Basic_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_61_leap_year_finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year :");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("This is the Leap Year");
        } else if (year%100==0) {
            System.out.println("This is the Leap Year");
        } else if (year%400==0) {
            System.out.println("This is the Leap Year");
        }
        else{
            System.out.println("This is the Not Leap Year");
        }
    }
}
