package Collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    //ArrayLists are not thread safe, not synchronized
    //Inorder to make thread safe use two approaches -

    //1. Collections.synchronizedList
    //external sync is required
    // no need to synchronize when add/removing values
    //sync when traversing/fetching using synchronized block

    //2. copyOnWriteArrayList class
    //external sync is not required

    public static void main(String[] args) {
        List<Integer> list=Collections.synchronizedList(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        synchronized (list){
            Iterator<Integer> it=list.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }

        }

        CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<Integer>();
        c.add(1);

    }
}
