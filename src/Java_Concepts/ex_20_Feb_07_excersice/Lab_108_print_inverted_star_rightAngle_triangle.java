package Java_Concepts.ex_20_Feb_07_excersice;

public class Lab_108_print_inverted_star_rightAngle_triangle {
    public static void main(String[] args) {
        for (int i = 5; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
