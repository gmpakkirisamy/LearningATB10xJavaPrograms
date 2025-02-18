package Java_Concepts.ex_13_Jan29th_excercise;

import java.util.Scanner;

public class Lab_53_find_maximum {
    //Find the Maximum of Two Numbers.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number !");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number !");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.printf("First number %d is greater",num1);
        }
        else {
            System.out.printf("Second Number %d is greater", num2);
        }
}
}
