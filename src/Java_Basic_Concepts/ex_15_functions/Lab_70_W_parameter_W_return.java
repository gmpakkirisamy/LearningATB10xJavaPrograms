package Java_Basic_Concepts.ex_15_functions;

public class Lab_70_W_parameter_W_return {
    public static void main(String[] args) {
    // With Parameter and with return type
        int c = sum_two(5,6);
        System.out.println("The Sum of Two Numbers : " +c);

        int d = sum_three(3,3,4);
           System.out.println(d);
            }


    static int sum_two(int a, int b) {
        return a+b;
    }
    static int sum_three(int a, int b, int c) {
        return a+b+c;
    }
}
