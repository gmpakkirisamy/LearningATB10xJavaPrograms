package ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_106_find_right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side 1 Measurement in CM");
        int a = sc.nextInt();
        System.out.println("Enter the Side 2 Measurement in CM");
        int b = sc.nextInt();
        System.out.println("Enter the Side 3 Measurement in CM");
        int c = sc.nextInt();

        if((c*c == (a*a + b*b))){
            System.out.println("Its the Right Angle Triangle!");
        }
        else {
            System.out.println("Its Not a right angle Triangle");
        }
        sc.close();

    }
}
