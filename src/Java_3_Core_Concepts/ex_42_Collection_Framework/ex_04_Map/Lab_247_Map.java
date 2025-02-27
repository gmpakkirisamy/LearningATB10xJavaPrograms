package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_04_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_247_Map {
    public static void main(String[] args) {
        //MAP
        //Map is an interface available in java.util package and introduced in the collection framework
        //It is the key value pair
        //Key will be always unique.  Keys cannot be duplicate. Null values allowed in key
        //Map interface has following concrete subclasses:
            //HashMap - No Duplicate key, No Order maintained
            //LinkedHashMap - Maintain the order of the elements
            //TreeMap - Element is sorted using natural ordering of its keys
            //Hashtable (Legacy)

        Map m1 = new HashMap();
        System.out.println("Hash Map");
        m1.put("Name","Samy"); //(Key > value)
        m1.put("RollNo","1");
        m1.put("PhNo","9245250007");
        m1.put("Name","RRR");
        m1.put(null,"dfd");//one null will be allowed
        m1.put(null,"mnb");
        System.out.println(m1);

        Map mm1 = new LinkedHashMap();
        System.out.println("Linkehash Map");
        mm1.put("Name","Samy"); //(Key > value)
        mm1.put("RollNo","1");
        mm1.put("PhNo","9245250007");
        mm1.put("Name","RRR");
        System.out.println(mm1);

        Map mmm1 = new TreeMap();
        System.out.println("Tree Map");
        mmm1.put("Name","Samy"); //(Key > value)
        mmm1.put("RollNo","1");
        mmm1.put("PhNo","9245250007");
        mmm1.put("Name","RRR");
        System.out.println(mmm1);



    }
}
