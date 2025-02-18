package Java_Concepts.ex_18_Strings;

public class Lab_85_string_heap_area {
    public static void main(String[] args) {
        String s1 = new String("Javatpoint"); // This will created in object area
        String s2 = new String("Javatpoint"); //This will created another new place in object area
        String s3 = "Pythonpoint"; // This will be created in String constanct pool (SCP) area.
        String s4 = "Pythonpoint"; // Here no new place will be created for Pythonpoint. Exsisitng will be assinged again.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3==s4); // this will be true becuase both the location reference will be same.
        System.out.println(s1==s3); // this will be false becuase this in different location
        System.out.println(s1.equals(s2)); // This will checks the content

    }
}
