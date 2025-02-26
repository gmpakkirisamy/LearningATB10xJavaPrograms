package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_241_List_Nested_ArrayList {
    public static void main(String[] args) {

        List<String> l = new ArrayList(); // I can hard set that what data types it should accept
        //l.add(1);
        l.add("Samy");
        l.add("Pakkiri");
        l.add("M");

        List<Integer> i = new ArrayList(); //It will accept only integer values
        i.add(5);
        i.add(6);
        i.add(7);
        //i.add("Google");

        List <String> j = new ArrayList();
        j.add("K");
        j.add("L");
        j.add("D");

        //NESTED ARRAY LIST

        List allCombinedList = new ArrayList(); // This will combine all the list into single list
        allCombinedList.add(l);
        allCombinedList.add(i);
        allCombinedList.add(j);
        System.out.println(allCombinedList);
        System.out.println(allCombinedList.get(2));
    }
}
