package Java_3_Core_Concepts.ex_42_Collection_Framework;

public class Lab_236_Collection_Framework_Basics {

    // Problem with Array and why we are going to collection frame work
    Integer [] arr = new Integer[10];

    //1. Fixed Size
    //2. Similar Data Types only accepted
    //3. Does not grow automatically
    //4. Unused data will cause memory shortage issue.

    // To fix this collection framework is implemented
    // They are used to store the element in memory with different way
    //They will do the majorly (CRUD)Operation, Create, Read, Update and Deleted.
    //All are doing the same operation but different method so we dnt need to worry about the implementation just simply use it.

    //COLLECTION (This is interface)
        //1. LIST -> This will keep duplicates
            //Arraylist ->Dynamic in Size, They are stored like arrays, continuous memory, it's a growable array
                        //Get element easy,inserting, delete is costly

            //Linkedlist > Doubly linked list, Insert, deletion is easy but finding the element is difficult

            //Stack > Last In First Out (LIFO Concept)

            //Vector . Similar to Arraylist (Old Legacy)

        //2. SET-> This will not keep duplicates
            //EnumSet
            //HashSet
            //LinkedHash
            //TreeSet

        //3. QUEUE ->FIFO (First In First Out format)
            //ArrayDeque
            //PriorityQue
            //LinkeList
}
