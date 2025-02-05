package ex_18_Strings;

public class Lab_85_string_heap_area {
    public static void main(String[] args) {
        String s1 = new String("Javatpoint"); // This will created in object area
        String s2 = new String("Javatpoint"); //This will created another new place in object area
        String s3 = "Pythonpoint"; // This will be created in String constanct pool (SCP) area.
        String s4 = "Pythonpoint"; // Here no new place will be created for Pythonpoint. Exsisitng will be assinged again.
        System.out.println(s1);
        System.out.println(s2);

    }
}
