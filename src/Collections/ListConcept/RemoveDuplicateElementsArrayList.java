package Collections.ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayList {
    ////How to remove duplicates from Arraylists
    //1. stream //2. LinkedHashSet
    public static void main(String[] args) {
        //LinkedHashSet
        ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,1,1,1,2,3));
        LinkedHashSet<Integer> l=new LinkedHashSet<Integer>(a);
        System.out.println(l);

        //stream
        System.out.println(a.stream().distinct().collect(Collectors.toList()));
    }
}
