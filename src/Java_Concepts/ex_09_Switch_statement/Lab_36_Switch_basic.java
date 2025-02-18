package Java_Concepts.ex_09_Switch_statement;

import java.util.Scanner;

public class Lab_36_Switch_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int day = sc.nextInt();
        // Switch can take byte/short/string/enum/interger/char/long but not support the boolean value

            switch(day) {
                case 1:
                    System.out.println("Monday");
                    break; // break has to be given to avoid the further execting the remaining statments
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input. Please enter the valid input");
                    break;
            }

        }

}

