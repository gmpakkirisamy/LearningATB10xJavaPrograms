package Java_1_Basic_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_101_print_numbers_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number do you want to print in reverse order!");
        int input = sc.nextInt();
        for (int i = input; i >0; i--) {
            System.out.println(i);
            sc.close();
            
        }
            }
}
