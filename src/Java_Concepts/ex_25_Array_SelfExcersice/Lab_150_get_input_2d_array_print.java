package Java_Concepts.ex_25_Array_SelfExcersice;

import java.util.Scanner;

public class Lab_150_get_input_2d_array_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows ?");
        int rows = sc.nextInt();
        System.out.println("Enter how many colum ?");
        int col = sc.nextInt();

        int[][] array = new int[rows][col];
        System.out.printf("Enter the %d values one by one", (rows * col));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                array[i][j] = sc.nextInt();

            }

        }
        System.out.println("The value of " + rows + "*" + col + " Matrix is......");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");

            }
            if (col == 1) {

            }
            else
            {
                System.out.println();
            }

        }
        sc.close();
    }

}
