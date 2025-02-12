package ex_22_Pattern_Programs;

import java.util.Scanner;

public class Lab_126_left_angle_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the left angle triangle");
        int input = sc.nextInt();

        for (int i = input; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
