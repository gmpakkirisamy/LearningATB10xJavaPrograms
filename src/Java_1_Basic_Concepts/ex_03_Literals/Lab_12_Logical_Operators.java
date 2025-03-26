package Java_1_Basic_Concepts.ex_03_Literals;

public class Lab_12_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false; // OR operator
        System.out.println(c);

        boolean d = true && false; // And operator
        System.out.println(d);
    }
}
