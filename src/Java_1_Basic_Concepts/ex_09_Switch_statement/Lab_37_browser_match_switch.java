package Java_1_Basic_Concepts.ex_09_Switch_statement;

import java.util.Scanner;

public class Lab_37_browser_match_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser (chrome/edge/firefox):");
        String browser = sc.next(); //.next() - is only used for acceptuing the string inputs

        switch (browser) {
            case "chrome" :
                System.out.println("Am Chrome Browser. Starting.....");
                break;
            case "edge" :
                System.out.println("Am Edge Browser. Starting.....");
                break;
            case "firefox" :
                System.out.println("Am Firefox Browser. Starting.....");
                break;
            default:
                System.out.println("Am not user what is the browser!");
                break;
        }
    }
}
