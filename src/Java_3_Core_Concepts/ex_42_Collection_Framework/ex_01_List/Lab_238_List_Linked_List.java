package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_01_List;

import java.util.LinkedList;
import java.util.List;

public class Lab_238_List_Linked_List {
    public static void main(String[] args) {
        //Linked list will be similar to array list, but memory allocation will be different , I will connect linked
        //Each other using the node
        //How they are stored that is the different between. Arrays are stored in continuous location
        //Linked list are linked to each other
        List linkedList = new LinkedList();
        linkedList.add("Samy");
        linkedList.add("Pakkirisamy");
        System.out.println(linkedList);
        System.out.println(linkedList.size()); // It will display the size
        linkedList.add("Pakkirisamy"); // We can add the duplicates values in list
        linkedList.add(true); // We can add different data type also
        linkedList.add(1); // We can add different data type also
        linkedList.add(null); // Null can be added
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty()); // I will check the list is empty or not
        System.out.println(linkedList.contains("Samy")); // It will check the data is available or not.
        System.out.println(linkedList.indexOf(true)); // It will find the location of the true
        System.out.println(linkedList.lastIndexOf("Pakkirisamy")); // It will find the first occurrence of the data

        List l = new LinkedList(); // We can call the child reference using the parent // This is called as Dynamic Dispatch
        l.add(1);
        l.add("Cool");
        System.out.println(l);

        System.out.println("---------First Method to Print the Linked List--------------------");
        System.out.println(linkedList); // It will print the entire array list value

        System.out.println("---------Second Method to Print the Linked List--------------------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
