package ex_26_Feb15th_excercise;

import java.util.Scanner;

public class Lab_157_square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the square root of it :");
        int input = sc.nextInt();

        System.out.println("The Square root of given number is : "+(Math.sqrt(input)));
        sc.close();
    }
}
