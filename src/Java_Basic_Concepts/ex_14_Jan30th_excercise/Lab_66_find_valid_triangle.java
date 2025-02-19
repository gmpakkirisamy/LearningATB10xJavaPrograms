package Java_Basic_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_66_find_valid_triangle {
    public static void main(String[] args) {
//        To check if a triangle is valid based on its three sides, you can use the Triangle Inequality Theorem. This theorem states
//        that for any three sides to form a triangle, the sum of the lengths of any two sides must be greater than the length of the
//        remaining side. Here's how you can check it:
//        check if a+b > c
//        check if a+c >b
//        check if b+c >a

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side 1 Value :");
        int side1 = sc.nextInt();
        System.out.println("Enter the Side 2 Value :");
        int side2 = sc.nextInt();
        System.out.println("Enter the Side 3 Value :");
        int side3 = sc.nextInt();
        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Please enter the valid side values!");
        }
        else {
            if (((side1+side2)>side3) && ((side1+side3)>side2) && ((side2+side3)>side1)) {
                System.out.println("This is valid Sides for Triange!");
        } else {
                System.out.println("This is not valid Sides for Triangle!");
            }
        }

    }
}
