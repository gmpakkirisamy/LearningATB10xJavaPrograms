package Java_2_OOPs_Concepts.ex_35_ENUM;

public class Lab_192_Enum_Basics {

    //ENUM (ENUMERATION)
    // This allows you to define a collection of constants.
    // Enums are useful for representing a fixed set of related values such as days of the week, pi value etc
//You can print the values by calling the enum directly
    public static void main(String[] args) {
        System.out.println(Day.SATURDAY);
    }

}


//These are constant values are store
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
