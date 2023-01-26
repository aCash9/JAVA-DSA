package JavaDSA.Heap;

import java.util.*;

public class PriorityQ {
    public static void main(String[] args) {
        //this priority queue forms a min heap
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(15);
        q.add(5);
        // one type transversing of the Priority Queue
        // System.out.println(q);
        System.out.println("size");
        System.out.println(q.size());
        System.out.println("peeking");
        System.out.println(q.peek());
        System.out.println("transversing");
        while (!q.isEmpty())
            System.out.println(q.poll());

        //for a max heap we have to add a constructor to the declaration
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        Q.add(10);
        Q.add(15);
        Q.add(5);
        // one type transversing of the Priority Queue
        // System.out.println(a);
        System.out.println("size");
        System.out.println(Q.size());
        System.out.println("peeking");
        System.out.println(Q.peek());
        System.out.println("transversing");
        while (!Q.isEmpty())
            System.out.println(Q.poll());
        
    }
}
