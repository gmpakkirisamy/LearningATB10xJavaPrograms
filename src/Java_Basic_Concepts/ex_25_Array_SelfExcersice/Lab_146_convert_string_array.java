package Java_Basic_Concepts.ex_25_Array_SelfExcersice;

public class Lab_146_convert_string_array {
    public static void main(String[] args) {
        String myStr = "Pakkirisamy";

        char[] myArray = myStr.toCharArray();

        for(char i : myArray){
        System.out.println(i);
        }
    }
}
