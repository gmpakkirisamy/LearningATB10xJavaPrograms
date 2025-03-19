package Java_2_OOPs_Concepts.ex_35_ENUM;

public class Lab_193_Enum_Real_Examples {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I will perform some jobs here");
        }
    }
}

enum URLS {
    // We will assign the constant url values
    google, restassured,katalon
}
