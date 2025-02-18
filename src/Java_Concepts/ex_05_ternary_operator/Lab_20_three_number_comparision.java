package Java_Concepts.ex_05_ternary_operator;

public class Lab_20_three_number_comparision {
    public static void main(String[] args) {
        //Finding the Largest Number, n1,n2, n3

        //Step 1: Find inputs/outputs
        //input/out are integer data type
        //Assume any inputs

        int a = 10;
        int b = 2;
        int c = 5;

        String maxNum = (a>=b) ? ((a>=c) ? "A is Greater " : "C is Greater"):((b>=c) ?"B is Greater " : "C is Greater");
        System.out.println(maxNum);

    }
}
