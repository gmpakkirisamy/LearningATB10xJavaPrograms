package Java_Concepts.ex_10_for_loop;

public class Lab_46_print_even_numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if(i%2==0){
                System.out.println("Its a Even Number "+i);
                continue;
            }
            else {
                System.out.println("Its a Odd Number "+i);
            }

        }
    }
}
