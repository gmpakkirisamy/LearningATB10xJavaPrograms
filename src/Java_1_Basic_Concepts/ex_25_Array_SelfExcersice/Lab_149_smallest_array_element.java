package Java_1_Basic_Concepts.ex_25_Array_SelfExcersice;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_149_smallest_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ?");
        int size = sc.nextInt();

        int [] input = new int[size];

        System.out.println("Enter the values one by one!");
        for (int i = 0; i < size; i++) {

            input[i] = sc.nextInt();


        }

        Arrays.sort(input);
        System.out.println("The Smallest number in the array is "+input[0]);
    }
}
