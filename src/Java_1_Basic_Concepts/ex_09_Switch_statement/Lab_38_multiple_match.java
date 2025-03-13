package Java_1_Basic_Concepts.ex_09_Switch_statement;

public class Lab_38_multiple_match {
    public static void main(String[] args) {
        //JDK>13 support only when JDK is more than 13
        int itemcode = 006;

        switch (itemcode) {
            case 001,002,003:
                System.out.println("All items are Fruit");
                break;
            case 004,005,006:
                System.out.println("All items are Electronic");
                break;
        }
    }
}
