package Java_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_110_reverse_pramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the Pramid!");
        int row = sc.nextInt();
        for (int i = row; i >= 1; i--) {
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
