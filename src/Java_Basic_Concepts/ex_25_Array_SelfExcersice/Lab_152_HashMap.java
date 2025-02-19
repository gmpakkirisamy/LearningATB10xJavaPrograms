package Java_Basic_Concepts.ex_25_Array_SelfExcersice;

import java.util.HashMap;

public class Lab_152_HashMap {
    public static void main(String[] args) {
        //A hash table is a data structure that stores key-value pairs and uses a hashing function
        // to compute an index (or hash code) into an array of buckets
        // When you add a key-value pair to a HashMap, the key is passed through a hash function.
        // The hash function converts the key into an integer (hash code), which determines the index in the array where the value will be stored.

        // Create the hash map
        HashMap <String, Integer> map = new HashMap<>();

        //Adding key values to the hashmap
        map.put("Karthy",1);
        map.put("Moorthy",2);
        map.put("Parthy",3);
        map.put("Roothy",4);
        map.put("Brakruthy",4);

        //Access the elements
        System.out.println("The value for key 'Apple' :"+map.get("Roothy"));
        System.out.println("The value for key 'Apple' :"+map.get("Brakruthy"));

        //Remove elements
        map.remove("Roothy");

        //Displaying the value using for each loop

        for (String i : map.keySet()){
            System.out.println("Key: " +i+" , Value: " +map.get(i));
        }

    }
}
