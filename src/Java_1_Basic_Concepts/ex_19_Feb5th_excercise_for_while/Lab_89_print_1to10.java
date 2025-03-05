package Java_1_Basic_Concepts.ex_19_Feb5th_excercise_for_while;

import java.util.Scanner;

public class Lab_89_print_1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print ?");
        int tot = sc.nextInt();
        for (int i = 1; i <= tot; i++) {
            System.out.print(i+"\t");
        sc.close();
        }
    }
}
