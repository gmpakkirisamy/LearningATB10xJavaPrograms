package Java_3_Core_Concepts.ex_40_Exceptions;

import java.util.Scanner;

public class Lab_223_Exception_Unchecked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip;
        System.out.println("Enter the Input to Proceed further :");
        ip = sc.next();

        int a = Integer.parseInt(ip); // Converting the String into integer.
        int b = 100/a;
        System.out.println("Output is " +b);
        System.out.println("End of the program!");
        sc.close();

        // Unchecked Exception - JVM does not know there is a issue in the code.
        int c = 0;
        int d = 10;
        int e = d/c;
        System.out.println(e);
        // ArithmeticException - If / by zero

        String name = null;
        name.trim();

        //NullPointerException: Cannot invoke "String.trim()"

       // int f = 3.14; Checked -



    }
}

// Below are the possible exceptions we have...
// ArithmeticException - If / by zero
// NumberFormatException - If input was string
// ArrayIndexOutOfBoundException - If we not give any inputs.