package Java_4_W3School_Programs;

import java.util.Scanner;

public class Lab_261_Area_of_rectangle {
    public static void main(String[] args) {
        //Calculate the Area of a Rectangle
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length! ");
        int rectanlgeLength = scanner.nextInt();

        System.out.println("Enter the breadth !");
        int rectangleBreadth = scanner.nextInt();

        int area = rectangleBreadth*rectanlgeLength;

        System.out.println("Area of the Rectangle is "+area);
    }
}
