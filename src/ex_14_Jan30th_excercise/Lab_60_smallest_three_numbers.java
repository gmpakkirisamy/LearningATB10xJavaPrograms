package ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_60_smallest_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowest =0;
        System.out.println("Enter the First Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();

        System.out.println("Enter the Third Number :");
        int num3 = sc.nextInt();

        if(num1<num2){
           lowest = num1;
        }
        else {
            lowest = num2;
        }
        if (num3 < lowest){
            lowest = num3;
        }
        System.out.printf("The lowest number is %d", lowest);
    }
}
