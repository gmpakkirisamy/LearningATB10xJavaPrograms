package Java_Basic_Concepts.ex_13_Jan29th_excercise;

import java.util.Scanner;

public class Lab_51_to_find_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Positive or Negative !");
        double num = sc.nextDouble();
        if(num>=0){
            System.out.println("Given number is Positive!");
        }
        else {
            System.out.println("Given number is Negative");
        }
    }
}
