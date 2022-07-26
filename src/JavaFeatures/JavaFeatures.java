package JavaFeatures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JavaFeatures {

    public static void main(String[] args) {

        //1. JDK 8: Streams API

        Stream.of(1, 2, 3, 4, 5, 6).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
        Stream.of("Hello", "Hi").map(e -> e + "world").forEach(e -> System.out.println(e));
        //printing using method expression
        Stream.of("Hello", "Hi").map(e -> e + " world").forEach(System.out::println);

        //2. JDK 8: Optional class

        String s[] = new String[4];
        s[2] = "a";
        //System.out.println(s[2].length()); //will through null pointer to avoid use Optional class
        Optional<String> isnull = Optional.ofNullable(s[2]);
        System.out.println(isnull);
        if (isnull.isPresent()) {
            System.out.println("not Null");
        } else {
            System.out.println(" null");
        }

        //3. JDK 9: Jshell

        //4. JDK 9: factory method for immutable collections

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> l = List.of(1, 2, 3);
        l.stream().forEach(e -> System.out.println(e));

        //5. JDK 10: var keyword

        var i = 10;
        var h = new HashSet<String>();
        h.add("abc");

        //6. JDK 12: new switch case

        var n = 3;
        var m = switch (n) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "Not found";
        };
        System.out.println(m);

        // JDK 13: Multiline string feature

        var s1 = """
                {
                    "Name":"John",
                    "Age":"30",
                }""";
        System.out.println(s1);

        // JDK 14: record keyword for class

        /*
        record Employee(String name, String age){}
        Employee e1=new Employee("11","11");
        This is a class with keyword record with inbuilt constructors,getter,setters,toString, etc
         */

        // JDK 14: instance of keyword without casting class type

        // JDK 15: sealed class

    }
}