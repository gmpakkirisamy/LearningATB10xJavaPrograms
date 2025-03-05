package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_245_Set {
    public static void main(String[] args) {
        // This will not allow the duplicates.

        Set hs = new HashSet();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Apple");
        hs.add("Watermelon");
        hs.add(null);  //We can add one null

        System.out.println(hs);


        Set ls = new LinkedHashSet();
        ls.add("Apple");
        ls.add("Orange");
        ls.add("Apple");
        ls.add("Watermelon");

        System.out.println(ls);
        System.out.println(ls.size());

        Set ts = new TreeSet();
        ts.add("Samy");
        ts.add("Samy");
        ts.add("Shadakshi");
        ts.add("samy");

        System.out.println(ts);

        System.out.println("For Each");
        for (Object o :ts){
            System.out.println(o);
        }

    }
}
