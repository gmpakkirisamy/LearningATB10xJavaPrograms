package Java_1_Basic_Concepts.ex_16_Feb1st_excercise;

import java.util.Scanner;

public class Lab_74_cateogorize_age {
    public static void main(String[] args) {
        System.out.println("Enter the age of the person !");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 0 && age <=12){
            System.out.println("You are in Child Category!");
        } else if (age>=13 && age <=19) {
            System.out.println("You are in Teenager Category!");
        } else if (age>=20 && age<=64) {
            System.out.println("You are in Adult Category!");
        } else if (age>=65) {
            System.out.println("You are in Senior Citizen Category!");
        }
        else {
            System.out.println("Please enter the valid age!");
        }
    }
}
