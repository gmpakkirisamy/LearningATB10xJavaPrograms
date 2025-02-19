package Java_Basic_Concepts.ex_16_Feb1st_excercise;

import java.util.Scanner;

public class Lab_72_dvisible_by_5_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int input = sc.nextInt();

        if(input%5==0 && input%11==0) {
            System.out.printf("Given number %d is divisible by both 5 and 11.",input);
        }
        else {
            System.out.printf("Given number %d is not divisible by 5 and 11.",input);
        }

    }
}
