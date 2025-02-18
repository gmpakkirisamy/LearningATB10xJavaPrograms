package Java_Concepts.ex_05_ternary_operator;

public class Lab_21_ageComparision {
    public static void main(String[] args) {
        int age =66;

        // Adult, Minor, Senior
        //Condtion Senior >65 minor age<18 adult >18.

        String result = (age <18) ? "You are Minor" : ((age>65) ? "You are Senior" : "You are Adult");
        System.out.println(result);
    }
}
