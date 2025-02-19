package Java_Basic_Concepts.ex_13_Jan29th_excercise;

import java.util.Scanner;

public class Lab_54_vowel_consonant {
    //Check if a Character is a Vowel or Consonant.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character to Check!");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Given Letter is Vowel");
        }
        else {
            System.out.println("Given Letter is Consonant");
        }
    }
}
