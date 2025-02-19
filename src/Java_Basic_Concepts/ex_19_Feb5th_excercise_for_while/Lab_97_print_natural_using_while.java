package Java_Basic_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_97_print_natural_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to print sum of natural numbers!");
        int input = sc.nextInt();
        int j =0;
        int i =1;
        while (i<=input) {
            j = j+i;
            i++;
        }
        System.out.println("The sum of natural number is "+j);
    }
}
