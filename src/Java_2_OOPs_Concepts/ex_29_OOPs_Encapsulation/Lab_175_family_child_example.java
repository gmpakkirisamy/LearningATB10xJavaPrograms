package Java_2_OOPs_Concepts.ex_29_OOPs_Encapsulation;

public class Lab_175_family_child_example {
    public static void main(String[] args) {

        mother1 mom1 = new mother1("Samy", "Momy");
        // System.out.println(mom1.son); - you cannot access the son directly since it is private
        //Access using the getter method and change the value using the setter method

        boolean isAthai = false;
        System.out.println(mom1.getSon(isAthai));
        System.out.println(mom1.getDaughter(isAthai));

        mom1.setDaughter("cool"); // Changing the daughter name using the setter method

        boolean isAthai1 = true;
        System.out.println(mom1.getDaughter(isAthai1));

        mom1.setSon("Stool"); // Changing the son name using the setter method
        System.out.println(mom1.getSon(isAthai1));
    }
}

class mother1 {
    private String son;
    private String daughter;

    mother1(String son_c, String daughter_c) {
        this.son = son_c;
        this.daughter = daughter_c;
    }

    public String getSon(boolean isAthai) {
        if (isAthai) {
            return son;
        } else {
            System.out.println("You are not athai to get son out!");
            return null;
        }
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getDaughter(boolean isAthai) {
        if (isAthai) {
            return daughter;
        } else {
            System.out.println("You are not athai to get daughter out");
            return null;
        }
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }
}


