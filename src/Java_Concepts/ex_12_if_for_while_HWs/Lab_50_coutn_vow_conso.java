package Java_Concepts.ex_12_if_for_while_HWs;

import java.util.Scanner;

public class Lab_50_coutn_vow_conso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to find Vowels and Consonents in it :");
        String name = sc.next();

        int Vowel = 0;
        int Conso = 0;

        String str = name.toLowerCase(); // It will convert all the text into lowercase

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
                Vowel++;
            }
            else {
                Conso++;
            }

        }
        System.out.println("Total Vowel characters are "+Vowel);
        System.out.println("Total Consonent characters are "+Conso);


    }
}
