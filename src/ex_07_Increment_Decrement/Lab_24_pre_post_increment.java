package ex_07_Increment_Decrement;

public class Lab_24_pre_post_increment {
    public static void main(String[] args) {
        int a = 9;
        int b = ++a;  // it will incremnet first then print
        System.out.println(b);

        int c = 9;
        int d = c++;
        System.out.println(d); //it will first print then increment
        System.out.println(c++); //


    }
}
