package Java_Core_Concepts.ex_40_Exceptions;

import java.util.Scanner;

public class Lab_230_try_catch_finally_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input !");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int v = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing the Scanner!");
        }
    }
}
