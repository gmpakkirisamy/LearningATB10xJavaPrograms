package Java_1_Basic_Concepts.ex_14_Jan30th_excercise;

import java.util.Scanner;

public class Lab_63_check_character_is_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character! ");
        char ch = sc.next().charAt(0);

        if(Character.isAlphabetic(ch)){
            System.out.println(ch+ "is an Alphabet");
        }
        else {
            System.out.println(ch+ "is not an Alphabet");
        }

    }
}
