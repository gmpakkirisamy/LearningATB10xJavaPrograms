package Java_Basic_Concepts.ex_26_Feb15th_excercise;

import java.util.Scanner;

public class Lab_156_positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find Positive or negative :");
        int input = sc.nextInt();

        if (input>=0){
            System.out.println("This is Positive Number!");
        }
        else {
            System.out.println("This is Negative Number! ");
        }
        sc.close();
    }
}
