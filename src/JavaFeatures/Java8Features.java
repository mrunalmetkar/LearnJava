package JavaFeatures;

import java.util.*;

public class Java8Features {

    //1. Lambda and Functional interfaces
    public static void main(String[] args) {

        //multithreading example for Lambda and Functional interfaces

        //This lambda expression is a implementation of the class implementing run() method
        Runnable r=()->
                        {
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Child Thread");
                            }
                        };
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

        //Collections example for Lambda and Functional interfaces
        //create reference of FI Comparator for lambda function instead of creating a class implementing FI Comparator
        Comparator<Integer> c=(obj1, obj2) ->
                                                {
                                                    return (obj1<obj2)?-1:(obj1>obj2)?+1:0;
                                                };
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(12,11,10,4,13,14));
        Collections.sort(arrayList,c);
        System.out.println(arrayList);
    }
}
