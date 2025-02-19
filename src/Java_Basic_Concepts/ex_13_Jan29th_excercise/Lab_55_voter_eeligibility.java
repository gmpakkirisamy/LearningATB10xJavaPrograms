package Java_Basic_Concepts.ex_13_Jan29th_excercise;

import java.util.Scanner;

public class Lab_55_voter_eeligibility {
    public static void main(String[] args) {
        //Check if a Person is Eligible to Vote (Age Check)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate age: ");
        int age = sc.nextInt();
        if (age<0){
            System.out.println("Sorry, Please enter the valid age!");
        }
        else if (age>=18) {
            System.out.println("You are elligible to vote!");
        }
        else {
            System.out.println(" You are not elligible to vote");
        }
    }
}
