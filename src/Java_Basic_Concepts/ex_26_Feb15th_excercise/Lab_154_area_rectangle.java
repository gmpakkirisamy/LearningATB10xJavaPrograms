package Java_Basic_Concepts.ex_26_Feb15th_excercise;

import java.util.Scanner;

public class Lab_154_area_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle!");
        int l = sc.nextInt();

        System.out.println("Enter the Breadth of the Rectangle!");
        int b = sc.nextInt();

        System.out.println("Area of the Rectangle is "+(l*b));
    }
}
