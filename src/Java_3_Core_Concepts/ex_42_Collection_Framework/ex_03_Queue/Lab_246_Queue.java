package Java_3_Core_Concepts.ex_42_Collection_Framework.ex_03_Queue;

import java.util.PriorityQueue;

public class Lab_246_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Samy");
        q.add("Samy");
        q.add("samy");
        q.add("samY");

        System.out.println(q);
    }
}
