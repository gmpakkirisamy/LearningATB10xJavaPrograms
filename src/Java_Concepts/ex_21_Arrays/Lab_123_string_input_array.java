package Java_Concepts.ex_21_Arrays;

import java.util.Scanner;

public class Lab_123_string_input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array first ?");

        int size = sc.nextInt();

        String [] array = new String[size]; // array[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name !");
            array [i] = sc.next();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
        sc.close();
    }
}
