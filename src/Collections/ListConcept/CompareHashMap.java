package Collections.ListConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<Integer,String>();
        hm.put(1,"abc");
        hm.put(2,"pqr");
        hm.put(3,"qe");

        HashMap<Integer, String> hm1=new HashMap<Integer,String>();
        hm1.put(1,"abc");
        hm1.put(2,"pqr");
        hm1.put(3,"qe");
        hm1.put(3,"qe");

        //compare hashmap using equals method
        System.out.println(hm.equals(hm1));

        //compare hashmap for same keys using keySet()
        System.out.println(hm.keySet().equals(hm1.keySet())); //this will remove the duplicate from hm1 as keyset returns
                                                                //set and it doesn't store duplicates

        //compare hashmaps by values, duplicates are not allowed
        System.out.println(new ArrayList<>(hm.values()).equals(new ArrayList<>(hm1.values())));

        //compare hashmaps by values, duplicates are  allowed
        System.out.println(new HashSet<>(hm.values()).equals(new HashSet<>(hm1.values())))
        ;

    }
}
