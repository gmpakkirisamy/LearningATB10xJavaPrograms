package ex_10_for_loop;

public class Lab_45_continue_example {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if(i==5){
                continue; //It will skip whe i =10
            }
            System.out.println(i);

        }
    }
}
