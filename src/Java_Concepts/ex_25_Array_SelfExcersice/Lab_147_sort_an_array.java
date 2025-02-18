package Java_Concepts.ex_25_Array_SelfExcersice;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_147_sort_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many word you want to sort ?");
        int tword = sc.nextInt();

        String[] words = new String[tword]; // Initialize the value to the array
        System.out.println("Enter the words one by one to sort!");
        for (int i = 0; i < words.length; i++) {

            words[i] = sc.next();
        }
        Arrays.sort(words); // This will sort function for arrays.

        for (String i : words) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
