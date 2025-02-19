package Java_Basic_Concepts.ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_79_find_armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check wheather its amstrong number or not !");

        int input = sc.nextInt();
        int OriginalNumber = input;
        int newNumber =0;

        while(input!=0){

            int digit = input%10;
            newNumber = digit*digit*digit +newNumber;

            input = input/10;

        }

        if (OriginalNumber==newNumber){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number!");
        }
    }
}
