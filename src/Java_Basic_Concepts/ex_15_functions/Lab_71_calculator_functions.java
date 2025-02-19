package Java_Basic_Concepts.ex_15_functions;

import java.util.Scanner;

public class Lab_71_calculator_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Enter the First Number:");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            }
        else {
            System.out.println("Enter integers only!");
            System.exit(0);
        }

        System.out.println("Enter the Second Number:");
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only!");
            System.exit(0);
        }

        int sum = sum(a,b);
        System.out.println("Added Value is "+ sum);

        int sub = sub(a,b);
        System.out.println("Subracted Value is "+sub);

        int mul = mul(a,b);
        System.out.println("Multiplied Value is " +mul);

        double div = div(a,b);
        System.out.println("Divided Value is "+ div);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub (int a, int b) {
        return a-b;
    }

    static int mul(int a, int b) {
        return a*b;
    }

    static double div (float a, float b) {
        return a/b;
    }
}
