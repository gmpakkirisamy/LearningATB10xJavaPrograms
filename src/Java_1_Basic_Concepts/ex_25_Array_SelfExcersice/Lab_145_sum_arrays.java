package Java_1_Basic_Concepts.ex_25_Array_SelfExcersice;

import java.util.Scanner;

public class Lab_145_sum_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total inputs in array !");
        int size = sc.nextInt();

        int sum = 0;
        int [] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number !");
            input[i] = sc.nextInt();
            sum = sum + input[i];
        }
        System.out.println("The Summ of number is "+sum);

    }
}
