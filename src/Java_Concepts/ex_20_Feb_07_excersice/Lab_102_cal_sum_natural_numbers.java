package Java_Concepts.ex_20_Feb_07_excersice;

import java.util.Scanner;

public class Lab_102_cal_sum_natural_numbers {
    public static void main(String[] args) {
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many natural number you want to calculate!");
        int input = sc.nextInt();

        for (int i = 1; i <=input ; i++) {
             j = j+i;
        }
        System.out.println(j);
    }
}
