package ex_17_Jan31st_excercise;

import java.util.Scanner;

public class Lab_81_eb_bill_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you consumed Units!");
        int unit = sc.nextInt();
        double tot = 0;

        if(unit<=100){
            tot = unit*0.5;
            System.out.println("Your Electricity Bill is " +tot);
        } else if (unit>100 && unit <=200) {
            tot = 50 + (unit-100)*0.75;
            System.out.println("Your Electricity Bill is " +tot);
        } else if (unit>200 && unit <=300) {
            tot = 125 + (unit-200)*1.20;
            System.out.println("Your Electricity Bill is " +tot);
        } else {
            tot = 245 +(unit-300)*1.50;
            System.out.println("Your Electricity Bill is " +tot);
        }
    }
}
