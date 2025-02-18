package Java_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_64_Check_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n==3){
            System.out.println("3 is prime number");
        } else if (n==2) {
            System.out.println("2 is prime number");
        }
        else if(n%2==0){
            System.out.println(n+ " is the not prime number");
        } else if (n%3==0) {
            System.out.println(n+ " is the not prime number");
        }
        else {
            System.out.println(n+ " is the prime number");
        }
        sc.close();
    }
}
