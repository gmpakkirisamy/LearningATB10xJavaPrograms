package Java_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_65_atm_process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long bal = 10000L;

        System.out.println("Enter the amount to withdraw ! ");
        long cash = sc.nextLong();
        if(cash<1 || cash> bal){
            System.out.println("Enter the valid amount or insufficient balance");
        } else if (cash%100==0) {

            long det = bal - cash;

            System.out.println("Withdraw was Successful! Your updated balance is "+ det);

        }
        else {
            System.out.println("Sorry, Enter the denomination in multiples of 100!");
        }


    }
}
