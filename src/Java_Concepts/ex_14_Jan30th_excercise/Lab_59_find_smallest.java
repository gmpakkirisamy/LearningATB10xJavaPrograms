package Java_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_59_find_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Number 2:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.printf("Number %d is minimum",num2);
        }
        else {
            System.out.printf("Number %d is minumum", num1);
        }
    }
}
