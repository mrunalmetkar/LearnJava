package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class DSVector {
    //Vector threadsafe
    //vector slower than arraylist
    //vector uses enum and iterator for traversing
    //grows double when capacity is reached
    //dynamic
    //legacy class of java

    public static void main(String[] args) {

        Vector<Integer> vector=new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(1);
        vector.add(5);
        vector.add(2);

        for(Integer i:vector){
            System.out.println(i);
        }

        Collections.sort(vector);
        System.out.println(vector);

        Iterator<Integer> it=vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Vector<Integer> vector1=new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);

        vector.addAll(vector1);
        System.out.println(vector);
    }
}
