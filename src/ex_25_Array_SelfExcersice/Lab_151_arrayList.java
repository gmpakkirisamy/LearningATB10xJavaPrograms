package ex_25_Array_SelfExcersice;

import java.util.ArrayList;

public class Lab_151_arrayList {
    public static void main(String[] args) {

        //An ArrayList is a resizeable array implementation in java. Unlike standard array, ArrayList can grow or
        //shrink dynamically as element are added or removed.
        //Key Features

        //Dynamic Size: Automatically resizes itself when elements are added or removed.
        //Indexed Access: Allows fast, random access to elements using an index.
        //Type-Safe: Can be parameterized with a specific type, ensuring type safety.

        ArrayList<String> name = new ArrayList<>();

        //Adding name to array list

        name.add("Karthy");
        name.add("Moorthy");
        name.add("Parthy");
        name.add("Cool");

        for (String i : name) {

            System.out.println(i);

        }
        name.remove("Cool");

        System.out.println("-------------------");

        for (String i : name) {

            System.out.println(i);

        }

    }
}
