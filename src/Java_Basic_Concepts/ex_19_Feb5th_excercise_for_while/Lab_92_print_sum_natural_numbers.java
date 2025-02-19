package Java_Basic_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_92_print_sum_natural_numbers {
    public static void main(String[] args) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print natural number ?");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
             j = j+ i;
        }
        System.out.println("The sum of Natural nmber is "+j);
    }
}
