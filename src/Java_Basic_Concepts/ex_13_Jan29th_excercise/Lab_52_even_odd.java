package Java_Basic_Concepts.ex_13_Jan29th_excercise;

import java.util.Scanner;

public class Lab_52_even_odd {
    //Program to find even or odd values
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number !");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is Even");
        }
        else {
            System.out.println("Given number is Odd");
        }
        sc.close();
    }
}
