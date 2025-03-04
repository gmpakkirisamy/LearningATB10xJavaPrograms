package Java_1_Basic_Concepts.ex_26_Feb15th_excercise;

import java.util.Scanner;

public class Lab_155_even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find odd or even!");
        int input = sc.nextInt();

        if(input%2==0){
            System.out.printf("Given number %d is even number", input);
        }
        else {
            System.out.printf("Given number %d is odd number", input);
        }
    }
}
