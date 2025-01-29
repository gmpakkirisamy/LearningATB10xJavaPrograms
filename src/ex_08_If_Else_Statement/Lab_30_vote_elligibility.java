package ex_08_If_Else_Statement;

import java.util.Scanner;

public class Lab_30_vote_elligibility {
    public static void main(String[] args) {

        System.out.println("Enter the age of the Citizen :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("you are not allowed to Vote");
        }
    }
}

