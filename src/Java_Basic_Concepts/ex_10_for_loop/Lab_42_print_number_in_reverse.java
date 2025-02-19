package Java_Basic_Concepts.ex_10_for_loop;

import java.util.Scanner;

public class Lab_42_print_number_in_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to print in Reverse ?");
        int num = sc.nextInt();
        for(int i =num; i>=1; i--) {
            System.out.println(i);
        }
    }
}
