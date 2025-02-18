package Java_Concepts.ex_05_ternary_operator;

public class Lab_19_ternary_nestedExamp {
    public static void main(String[] args) {
        int a = 111;

        String result = (a>90) ? (a>110 ? "Value is Greater" : "Value is between 90 to 110") : "Value is less than 90";
        System.out.println(result);
    }
}
