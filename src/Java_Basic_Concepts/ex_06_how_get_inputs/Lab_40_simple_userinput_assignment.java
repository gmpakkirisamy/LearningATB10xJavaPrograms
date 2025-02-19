package Java_Basic_Concepts.ex_06_how_get_inputs;

import java.util.Scanner;

public class Lab_40_simple_userinput_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Employee :");
        String name = sc.next();
        System.out.println("Enter the Age of the Employee:");
        int age = sc.nextInt();
        System.out.println("Enter the salary of the Employee:");
        long sal = sc.nextLong();

        System.out.println("Name :" +name);
        System.out.println("Age: "+age);
        System.out.println("Sal: "+sal);

    }
}
