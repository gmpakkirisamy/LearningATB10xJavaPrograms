package Java_Basic_Concepts.ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_80_Loan_elligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the employee! ");
        int age = sc.nextInt();
        System.out.println("Enter the salary of the employee!");
        double sal = sc.nextDouble();
        System.out.println("Enter the Crdit Score you have!");
        int credScore = sc.nextInt();

        if(age<=0 && sal<=0 && credScore<0){
            System.out.println("Please enter the valid Age or Salary or Cred Score!!");
        } else if (age<18|| age>80 && sal<30000) {
            System.out.println("Sorry, Your age or salary is not in limit, So you are not elligible for applying loan!");
        } else if (credScore<650 || credScore>850) {
            System.out.println("Your Cred Scrore is not as per the bank limit to apply the Loan!");
        }else {
            System.out.println("Congratualtions ! You are elligible to Apply the Loan !");

    }

    }
}
