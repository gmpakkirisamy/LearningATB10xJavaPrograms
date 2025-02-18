package Java_Concepts.ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_77_fibbonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to generate fibonacci series !");
        int input = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < input; i++) {
            c= a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

        }
    }

