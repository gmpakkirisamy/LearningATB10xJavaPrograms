package Java_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_94_print_1to10_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Till which number you want to print ?");
        int input = sc.nextInt();
        int i =1;
        while(i<=input) {
            System.out.print(i+"\t");
            i++;
        }
    }
}
