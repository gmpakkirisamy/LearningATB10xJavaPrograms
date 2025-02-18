package Java_Concepts.ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_76_factorial_program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to perform factorial !");
        int input = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <=input ; i++) {

            fact = fact*i;
        }
        System.out.println("The value of factorial of given number is " +fact);
    }
}
