package ex_10_for_loop;

import java.util.Scanner;

public class Lab_43_find_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the even numbers: ");
        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            if (i%2 == 0) {
                System.out.println(i);

            }

        }
    }
}
