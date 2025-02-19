package Java_OOPs.ex_36_Wrapper_Class;

public class Lab_198_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";

        // You can convert to wrapper integer
        //String to Wrapper Conversion
        Integer a = Integer.parseInt(num); // Wrapper String -> Wrapper conversion - String to interger coversion

        //You can covert to int.
        //String to Primitive conversion.
        int a3 = Integer.parseInt(num);  //

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer aa = Integer.valueOf("10"); // This way also we can covert string to integer.
        System.out.println(aa);

    }
}
