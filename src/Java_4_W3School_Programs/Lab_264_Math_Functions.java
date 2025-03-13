package Java_4_W3School_Programs;

public class Lab_264_Math_Functions {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
        System.out.println(Math.min(5,3));
        System.out.println(Math.max(6,8));
        System.out.println(Math.abs(-1)); // Return the positive value
        System.out.println(Math.random()); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        //To get more random numbers
        int rand = (int)(Math.random()*101);
        System.out.println(rand);
    }
}
