package Collections;

import java.util.PriorityQueue;


public class DSPriorityQueue {

    //maintains ascending order in the queue
    //use custom comparator to define queue operations
    //the default queue operations only work on the primitive types not on objects
    //for e.g. if we have to add class Employee objects in the queue then use comparator interface
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(5);
        System.out.println(priorityQueue.poll());
    }
}
