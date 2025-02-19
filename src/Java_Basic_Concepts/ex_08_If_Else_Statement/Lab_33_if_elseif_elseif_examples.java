package Java_Basic_Concepts.ex_08_If_Else_Statement;

import java.util.Scanner;

public class Lab_33_if_elseif_elseif_examples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Number 1 is greater");
        }
        else if(num1<num2) {
            System.out.println("Number 2 is greater");
        }
        else {
            System.out.println("Number 1 & Number 2 is Equal");
        }

        sc.close();

    }
}
