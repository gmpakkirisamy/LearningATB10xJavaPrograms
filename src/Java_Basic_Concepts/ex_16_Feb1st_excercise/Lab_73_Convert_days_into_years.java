package Java_Basic_Concepts.ex_16_Feb1st_excercise;

import java.util.Scanner;

public class Lab_73_Convert_days_into_years {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days to convert!");
        int days = sc.nextInt();

        int year = days/365;
        System.out.println("Year :" +year);

        int month = ((days-(365*year))/30);
        System.out.println("Month :"+month);

        int day = (days - (month*30 + (365*year)));
        System.out.println("Day :"+day);

    }
}
