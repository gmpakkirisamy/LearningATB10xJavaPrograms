package Java_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_103_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which Multiplication Table you want to print ?");
        int input = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {

            System.out.printf(i+"*%d=",input);
            System.out.println(i*input);
            sc.close();

        }
    }
}
