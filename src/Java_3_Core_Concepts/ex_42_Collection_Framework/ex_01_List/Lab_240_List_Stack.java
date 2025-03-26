package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.Stack;

public class Lab_240_List_Stack {
    public static void main(String[] args) {
        //Last in First Out

//        Stack s = new Stack();
//        s.add("Samy");
//        s.add("Pakkiri");
//        s.add(1);
//        s.add(null);
//        System.out.println(s);

        Stack s = new Stack<>();
        s.push("Pakkiri");
        s.push("Samy");
        s.push("Life");
        s.push("Automation");

        System.out.println(s.size());
        System.out.println(s);

        System.out.println(s.peek()); // Last element will be displayed
        System.out.println(s);
        System.out.println(s.pop()); // It will remove the last element added
        System.out.println(s);

        System.out.println(s.get(2));
    }
}
