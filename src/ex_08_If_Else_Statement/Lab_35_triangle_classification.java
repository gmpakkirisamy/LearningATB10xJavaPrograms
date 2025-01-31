package ex_08_If_Else_Statement;

import java.util.Scanner;

public class Lab_35_triangle_classification {
    public static void main(String[] args) {
        System.out.println("Enter the side 1 Value:");
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();

        System.out.println("Enter the side 2 Value:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the Side 3 Value:");
        double side3 = sc.nextDouble();

        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Please enter the valid side values!");
        }
        else {

            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("This is Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("This is Isoselene Triangle");
            } else {
                System.out.println("This is Scalene Triangle ");
            }
        }
        sc.close();
    }
}
