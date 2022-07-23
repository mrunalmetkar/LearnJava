package Collections;

import java.util.AbstractMap;
import java.util.TreeMap;

public class DSTreeMap {
    //TreeMap internally has red-black tree
    //keeps the map in sorted order
    public static void main(String[] args) {
        TreeMap<Integer, String> map=new TreeMap<Integer, String>();
        map.put(1,"ABC");
        map.put(3,"PQR");
        map.put(5,"PQR");
        map.put(2,"PQR");
        map.put(4,"PQR");

        map.forEach((k,v)->System.out.println(k+v));

        System.out.println(map.lastEntry());;
        System.out.println(map.lastKey());

        System.out.println(map.headMap(5).keySet());
    }

}
