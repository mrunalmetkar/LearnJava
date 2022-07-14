package Collections.ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DSArrayList {
    //
    //1. Dynamic datastructure
    //2. not synchronized, not thread safe
    //3. maintains insertion order
    //4. can be randomly accessed as it uses indexes internally
    //5. both generic nd nongeneric
    //6. virtual defaullt capacity will be 10
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();  //nongeneric
        arrayList.add("A");
        arrayList.add("B");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); //Generic //virtual capacity done as 10

        //Virtual capacity doesn't have any space in bytes/bits
        //arr.size will give physical capacity

        //can also store a class object in arraylist
        //Arraylist<Employee> arr=new ArrayList<Employee>();
        //arr.add(e1); arr.add(e2);    e1 and e2 are Employee class


        //ways to iterate arrayist
        //1. typical for
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }

        //2. JDK 8 - streams with lambda
        arrayList.stream().forEach(s -> System.out.println(s));

        //3. Iterator approach
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3));
    System.out.println(list);

    //Methods

        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();

        list1.add(12);
        list2.add(12);

        list1.addAll( 1,list2);

        list1.contains(12);
        list1.indexOf(12);

        ArrayList<Integer> cl= (ArrayList<Integer>) list1.clone();

        list1.lastIndexOf(12);

        ArrayList<Integer> nos=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nos.removeIf(no->no%2==0);
        System.out.println(nos);
        System.out.println(nos.subList(1,3));
        System.out.println(nos.retainAll(Collections.singleton(2)));



    }



}