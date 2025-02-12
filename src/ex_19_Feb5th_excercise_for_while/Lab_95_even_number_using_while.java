package ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_95_even_number_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till which number you want to print even numbers ?");
        int input = sc.nextInt();
        int i = 1;
        while(i<=input){
            if(i%2==0) {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
