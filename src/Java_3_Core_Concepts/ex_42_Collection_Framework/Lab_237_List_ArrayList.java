package Java_3_Core_Concepts.ex_42_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_237_List_ArrayList {
    public static void main(String[] args) {
        // Order will be maintained the list
        //To find how many predefined function available
        // Type in Terminal javap java.util.Lis

        //ArrayList arrayList = new ArrayList(15); - We can add the initial capacity.
        //Default capacity is 10

        ArrayList arrayList = new ArrayList();
        arrayList.add("Samy");
        arrayList.add("Pakkirisamy");
        System.out.println(arrayList);
        System.out.println(arrayList.size()); // It will display the size
        arrayList.add("Pakkirisamy"); // We can add the duplicates values in list
        arrayList.add(true); // We can add different data type also
        arrayList.add(1); // We can add different data type also
        arrayList.add(null); // Null can be added
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty()); // I will check the list is empty or not
        System.out.println(arrayList.contains("Samy")); // It will check the data is available or not.
        System.out.println(arrayList.indexOf(true)); // It will find the location of the true
        System.out.println(arrayList.lastIndexOf("Pakkirisamy")); // It will find the first occurrence of the data

        List l = new ArrayList(); // We can call the child reference using the parent // This is called as Dynamic Dispatch
        l.add(1);
        l.add("Cool");
        System.out.println(l);

        System.out.println("---------First Method to Print the Array List--------------------");
        System.out.println(arrayList); // It will print the entire array list value but not one by one

        System.out.println("---------Second Method to Print the Array List (Default Loop)--------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("---------Third Method to Print the Array List (For each Loop)--------------------");

        for (Object o:arrayList) {
            System.out.println(o);
        }

        System.out.println("---------Fourth Method to Print the Array List (Iterator)--------------------");
        // Iterator - Anchor - go one by one forward -> get access them
        //HasNext() -> till has next element is present it will move forward
        //This will support for all the list types

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
