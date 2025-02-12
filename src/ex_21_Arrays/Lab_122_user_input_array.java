package ex_21_Arrays;

import java.util.Scanner;

public class Lab_122_user_input_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in integer only");
        int size = sc.nextInt();

        int[] b = new int[size]; // Initialize the value to the array

        for (int i = 0; i < size; i++) {

            System.out.println("Enter the value ?");
            b[i] = sc.nextInt();

        }
        System.out.println("Printing the value! ");
        for (int i = 0; i < size; i++) {
            System.out.print(b[i]+"\t");

        }
    }
}
