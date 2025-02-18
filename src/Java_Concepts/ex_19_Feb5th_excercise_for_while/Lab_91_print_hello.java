package Java_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_91_print_hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times to print 'Hello'");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("Hello");
        sc.close();
        }
    }
}
