package Java_Concepts.ex_25_Array_SelfExcersice;

import java.util.Scanner;

public class Lab_143_count_words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to count the words!");

        String inputString = sc.nextLine(); // This will read the entire line as input including the spaces

        int count = inputString.split("\\s").length; //This method splits the string words into an array of substrings based on whitespace.

        System.out.println("The entered sentence having "+count+ " Words in it");

    }
}
