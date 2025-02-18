package Java_Concepts.ex_18_Strings;

public class Lab_87_comparing_strings_concepts {
    public static void main(String[] args) {
        String s1 = "Pakkiri";
        String s2 = "PAkkiri";

        String s3 = new String("Samy");
        String s4 = new String("Samy");
        String s5 = new String("Samy");

        // == This will check the location reference only
        System.out.println(s1==s2); // It will be true because its in the same scp
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s3==s4);

        //To compare the content we use .equals method

        System.out.println(s1.equals(s2));
         // It will be true because its in the same scp
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2)); // It will ignore the case and compare the letters


    }
}
