package Java_1_Basic_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_109_pramind_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pramid!");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            //Print spaces
            for (int j =row; j>i; j--){
                System.out.print(" ");
            }
            //To Print the astrisks
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }