package Java_Basic_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_114_string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to find palindrome are not ");
        String input = sc.next();

        StringBuffer stng = new StringBuffer(input);
       // StringBuffer stng2 = stng.reverse();

        if(stng.equals(stng.reverse())) {
            System.out.println("Its Palindrome Text");
        }
        else {
            System.out.println("Its not a Palindrome Text");
        }

    }
}
