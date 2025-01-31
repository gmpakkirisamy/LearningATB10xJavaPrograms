package ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_58_lagrest_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        int larger;
        if(num1>num2){
            larger = num1;
            }
            else {
                larger= num2;
            }
            if(num3 > larger) {
                larger = num3;
            }
        System.out.println("Larger number is "+larger);
        sc.close();
        }

}
