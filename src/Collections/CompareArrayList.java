package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

    //Compare 2 arraylists
    //1. sort and then use equals method
    //2. compare and find extra ele using removeAll()
    //3. compare and find and remove extra ele from other list using removeAll()
    //4. find out common elements
    public static void main(String[] args) {
        //1.
        ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> b=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a.equals(b));

        //2.
        ArrayList<Integer> c=new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
        ArrayList<Integer> d=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        c.removeAll(d);
        System.out.println(c);

        //3.
        d.removeAll(c);
        System.out.println(c);

        //4.
        c.retainAll(d);
        System.out.println(c);

    }
}
