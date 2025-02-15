package ex_25_Array_SelfExcersice;

import java.util.Scanner;

public class Lab_148_average_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What the length of the array ?");
        int len = sc.nextInt();
        float total = 0;
        int[] arr = new int[len];
        System.out.println("Enter tha inputs one by one!");
        for (int i = 0; i < arr.length; i++) {  //Instead of arr.length you can use len variable.

            arr[i] = sc.nextInt();

            total = arr[i] + total;

        }

        System.out.println("Average value is "+(total/len));

        sc.close();
    }
}
