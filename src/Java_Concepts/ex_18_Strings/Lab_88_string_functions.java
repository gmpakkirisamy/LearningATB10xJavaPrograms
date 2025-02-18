package Java_Concepts.ex_18_Strings;

public class Lab_88_string_functions {
    public static void main(String[] args) {

        //Commonly used functions

        String s1 = "Pakkirisamy";
        String s2 = s1.substring(7,11); // Substring will print the letter between the index
        System.out.println(s2);

        String s3 = s1.concat("DurgaDevi"); // I will concatanate both the strings
        System.out.println(s3);
    }
}
