package ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_104_factorial_number {
    public static void main(String[] args) {
        int j =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to perform factorial ?");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            j = j*i;
        }
        System.out.println(j);
        sc.close();
    }
}
