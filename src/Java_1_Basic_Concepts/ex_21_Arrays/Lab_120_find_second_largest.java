package Java_1_Basic_Concepts.ex_21_Arrays;

import java.util.Arrays;

public class Lab_120_find_second_largest {
    public static void main(String[] args) {

        int[] numbers = {23,99,100,450,12,56};

        Arrays.sort(numbers); // It will sort the numbers in array in the ascending order.

        System.out.println(numbers[numbers.length-2]);
    }
}
