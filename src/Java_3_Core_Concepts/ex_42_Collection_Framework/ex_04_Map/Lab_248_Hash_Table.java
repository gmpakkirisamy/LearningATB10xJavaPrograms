package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_04_Map;

import com.sun.security.jgss.GSSUtil;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_248_Hash_Table {
    public static void main(String[] args) {
        //Hashtable - Synchronized, slow and legacy class - Thread safe
        //T1, T2 - they will use one by one.
        //null key and null value is not allowed


        Hashtable <Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        System.out.println(ht1);

        Enumeration <Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
