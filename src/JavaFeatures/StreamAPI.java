package JavaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        ArrayList<String> s=new ArrayList<>(Arrays.asList("AA","A","AAA","AAAA","AAAAA"));

        //This is bydefault ascending and calls compare method of Comparator FI
        System.out.println(s.stream().sorted().collect(Collectors.toList()));

        //This is custom code for desc order and calls compareTo method of Comparator FI
        Comparator<String> c=(s1, s2)-> -s1.compareTo(s2);
        System.out.println(s.stream().sorted(c).collect(Collectors.toList()));

        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,2,1,1));
        //compulsory give Comparator object to max and min
        System.out.println(l.stream().max((i1,i2)->i1.compareTo(i2)).get());
        System.out.println(l.stream().min((i1,i2)->i1.compareTo(i2)).get());
        System.out.println(l.stream().min((i1,i2)->-i1.compareTo(i2)).get());
        System.out.println(l.stream().max((i1,i2)->-i1.compareTo(i2)).get());

        //method reference in stream
        l.stream().forEach(System.out::print);

        //toArray()
        //constructor reference
        Integer[] i=l.stream().toArray(Integer[]::new);
        for (Integer i1:i)
        {
            System.out.println(i1);
        }

        Stream s2=Stream.of(1,2,3,4);
        s2.forEach(System.out::println);

    }
}
