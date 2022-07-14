package Collections.ListConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DSHashMap {
    //Hashmap non syncronized
    //not ordered, no indexing
    //null value is allowed once for keys(no error but will only store once in memory) and
    // multiple null for values allowed
    // key cant be duplicate
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<String,String>();
        hashMap.put("querty","www");
        hashMap.put(null,"ACS");
        hashMap.put(null,"PER");   //will store only this entry in the memory

        hashMap.put("a",null);

        //Iterate over  hashmap using keyset and entryset

        Iterator<String> it=hashMap.keySet().iterator();       //keyset for key
        while (it.hasNext()){
            String value=it.next();
            System.out.println(hashMap.get(value));
        }

        Iterator<Map.Entry<String,String>> it1=  hashMap.entrySet().iterator();  //entrySet for key-value set
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        //iterate using lambda and for each
        hashMap.forEach((k,v)->System.out.println(k+v));
    }
}
