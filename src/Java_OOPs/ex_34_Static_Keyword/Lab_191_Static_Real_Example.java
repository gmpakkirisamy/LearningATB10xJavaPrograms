package Java_OOPs.ex_34_Static_Keyword;

public class Lab_191_Static_Real_Example {
    public static void main(String[] args) {

        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);

    }
}

class Automation {
    static String driver = "Chrome";
}
