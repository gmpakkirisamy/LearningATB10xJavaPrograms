package Java_Concepts.ex_06_how_get_inputs;

import java.util.Scanner;

public class Lab_29_scanner_inputs {
    public static void main(String[] args) {

        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int name = sc.nextInt();
        System.out.println("Hello Your age is"+name);

    }
}
