package Java_3_Core_Concepts.ex_42_Collection_Framework;

public class Lab_252_Collection_Framework_Basics {

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
                        //Get element easy,inserting, delete is costly or heavy

            //LinkedList > Doubly linked list, Insert, deletion is easy but finding the element is difficult.
                            //elements are stored internally using the node representation

            //Stack > Last In First Out (LIFO Concept)

            //Vector . Similar to Arraylist (Old Legacy)

        //2. SET-> This will not keep duplicates. (This will not allow the duplicates)

            //HashSet  > Hashing mechanism is used to store the data. And not in order. One null is allowed.
            //LinkedHash > Order will be maintained
            //TreeSet > Natural sorting order will be maintained. Alphabetical order. Null is not possible. And different
                //element is not possible to add.
            //EnumSet > This is not at all used.

        //3. QUEUE ->FIFO (First In First Out format) (This is very rarely used)
            //ArrayDeque
            //PriorityQue
            //LinkedList
}
