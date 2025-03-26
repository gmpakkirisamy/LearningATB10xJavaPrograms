package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_242_List_Functions {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(98);
        marks.add(100);
        marks.add(88);
        marks.add(65);
        marks.add(36);

        System.out.println(marks);
        Collections.sort(marks); // It is the inbuilt function which is for sorting the values
        System.out.println(marks);
        //Collection - It is interface
        //Collection - Class(it contains complete methods which list, set, queue may require)

        Collections.sort(marks, Collections.reverseOrder()); // It is the inbuilt function which is for reverse sorting the values
        System.out.println(marks);
    }
}
