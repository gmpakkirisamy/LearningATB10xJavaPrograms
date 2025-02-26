package Java_3_Core_Concepts.ex_42_Collection_Framework;

import java.util.Vector;

public class Lab_239_List_Vector {
    public static void main(String[] args) {
        //Vector - It is just similar to array list (We are not using at all and people also will not prefer to use it)
        //Old legacy
        //All the operation are in vector are synchronized, they are thread safe. (All the operation are done one by one, by each thread)

        Vector v = new Vector();
        v.add("Samy");
        v.add(1);
        v.add(null);
        System.out.println(v.contains("Samy"));
        System.out.println(v);
    }
}
