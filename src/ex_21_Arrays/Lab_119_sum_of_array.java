package ex_21_Arrays;

public class Lab_119_sum_of_array {
    public static void main(String[] args) {

        int[] b = {1,2,3,4,5,6};
        int sum =0;
        int sum2 = 0;

        for (int i = 0; i <b.length ; i++) {
            sum = sum + b[i];
        }
        System.out.println("Output using for loop "+sum);

        System.out.println("using For Each Loop!");

        for (int n : b) {  // It will only work with array and some part of collection framework
            sum2 = sum2 + n;

        }
        System.out.println("Output using For Each Loop "+sum2);
    }
}
