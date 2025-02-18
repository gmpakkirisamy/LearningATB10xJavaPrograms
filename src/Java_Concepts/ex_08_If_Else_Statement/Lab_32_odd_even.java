package Java_Concepts.ex_08_If_Else_Statement;

import java.util.Scanner;

public class Lab_32_odd_even {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println(" The Entered Number is Even Number");
        }
        else {
            System.out.println("The Entered Number is Odd Number");
        }
        sc.close(); // This is mandatory to close the taking inputs
    }
}
