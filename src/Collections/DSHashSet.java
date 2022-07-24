package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DSHashSet {
    //allows null values
    //no duplicates

    public static void main(String[] args) {

        Set set=new HashSet();
        set.add(1);
        set.add("abc");
        set.add("pqr");
        set.add(null);

        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[]{1,2,3}));
        System.out.println(set1);

        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
        System.out.println(set2);

        //Union
        set1.addAll(set2);
        System.out.println(set1);

        //Intersection
        Set<Integer> s1=new HashSet<>(Arrays.asList(new Integer[]{1,2,3}));
        Set<Integer> s2=new HashSet<>(Arrays.asList(new Integer[]{1,2}));
        s2.retainAll(s1);
        System.out.println(s2);

        //DIfference
        Set<Integer> s3=new HashSet<>(Arrays.asList(new Integer[]{1,2,3}));
        Set<Integer> s4=new HashSet<>(Arrays.asList(new Integer[]{1,2}));
        s3.removeAll(s4);
        System.out.println(s3);

    }
}
