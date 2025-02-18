package Java_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_90_print_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number you want to print even numbers ?");
        int input = sc.nextInt();
        for (int i = 1; i <=input ; i++) {
            if (i%2==0){
                System.out.print(i+"\t");
            }
        sc.close();
        }
    }
}
