package JavaFeatures;

import java.util.function.Predicate;

public class PredicateFI {
    //FI with one test() method
    //used for conditional checks
    //returns boolean
    public static void main(String[] args) {
        Predicate<Integer> p1= i -> i%2==0;
        System.out.println(p1.test(10));

        Predicate<String> p2= s -> s.length()>5;
        System.out.println(p2.test("Hell1"));

        String[] st={"Hello","Hi","Hellq"};
        Predicate<String> p3= s -> s.length()==5;
        for (String s1:st)
        {
            if(p3.test(s1))
            {
                System.out.println(s1);
            }
        }

        //Predicate joining
        //can be performed using or, and and negate
        //combine two predicates
        int[] x={1,2,3,4,5,6,7};
        Predicate<Integer> p5=i->i%2==0;
        Predicate<Integer> p6=i->i>10;
        for (Integer x1:x)
        {
            if(p5.or(p6).test(x1))
            {
                System.out.println(x1);
            }
        }


    }
}
