package ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_78_Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Palindrome Number or Not !");

        int input = sc.nextInt();

        int NonReversedNumber = input;
        int ReversedNumber = 0;

        while(input!=0){
            int digit = input%10;
            ReversedNumber = ReversedNumber*10+digit;
            input = input/10;
        }
        if(NonReversedNumber==ReversedNumber){
            System.out.println("Hey Its Palindrome Number!");
        }
        else {
            System.out.println("Ho Ho! Its Not Palindrome Number!");
        }
    }
}
