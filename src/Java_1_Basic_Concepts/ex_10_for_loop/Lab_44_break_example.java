package Java_1_Basic_Concepts.ex_10_for_loop;

public class Lab_44_break_example {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i==5) {
                break; // Once i is become 5 then i will stop the program and exit
            }
            System.out.println(i);
        }
    }
}
