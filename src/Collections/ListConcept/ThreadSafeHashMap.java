package Collections.ListConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeHashMap {

    //HashMap is not synchronized, not thread safe
    //To make it thread safe - use SynchronizedMap and ConcurrentHashMap

    //Comparison

    //HashMap
    //JDK 1.5
    //thread unsafe, not synchronized, slow performance
    //one null key and multiple null values are allowed

    //SynchronizedMap
    //thread safe, slow per
    //null key and null values allowed
    //object lock

    //ConcurrentHashMap
    //thread safe, fast perf
    //null key and null valyues not allowed
    //segment lock

    //HashTable
    //JDK 1.2
    //thread safe, slow performance
    //null keys and values are not allowed
    //object level lock
    public static void main(String[] args) {

        //create map
        Map<String,String> m=new HashMap<String,String>();
        m.put("a","b");
        System.out.println(m);

        //convert into thread safe into sync. version
        Map<String,String> map=Collections.synchronizedMap(m);

        //2nd way using concurrent hashmap
        //When we try to update the same thread using concurrent hashmap throws ConcurrentHashMap exception
        ConcurrentHashMap<String,String> cm=new ConcurrentHashMap<>();

    }
}
