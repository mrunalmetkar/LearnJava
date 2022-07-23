package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Immutable hashMap with one entry
        Map<String,Integer> h=Collections.singletonMap("test",11);

        //creating HashMap using Java8 Stream.Of

        Map<String,String> m=Stream.of(new String[][]{
                {"q","w"},
                {"a","g"},
        }).collect(Collectors.toMap(data->data[0],data->data[1]));
        System.out.println(m);





    }
}
