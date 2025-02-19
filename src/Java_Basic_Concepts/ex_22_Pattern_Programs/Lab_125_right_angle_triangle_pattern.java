package Java_Basic_Concepts.ex_22_Pattern_Programs;

import java.util.Scanner;

public class Lab_125_right_angle_triangle_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print ?");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
