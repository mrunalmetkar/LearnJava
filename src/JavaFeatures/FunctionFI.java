package JavaFeatures;

import java.util.function.Function;
class Employee{
    int marks;
    String name;


    public Employee(int marks, String name ) {
        this.marks = marks;
        this.name = name;

    }
}
public class FunctionFI {

    //use when we don't have any conditional checks
    //predef Functional interface
    //has apply() method
    //Return type is provided in Function<Input, Return type>
    public static void main(String[] args) {
        Function<Integer,Integer> f= i->i*i;
        System.out.println(f.apply(10));

        Function<Employee,String> f1=s -> {
            int smarks=s.marks;
            String sgrade=" ";
            if(s.marks>10){
                sgrade="Pass";
            }
            else {
                sgrade="Fail";
            }
            return sgrade;
        };

        Employee[] e={new Employee(10, "Hello"),new Employee(20,"abc")};
        for (Employee emp:e) {
            System.out.println(f1.apply(emp));
        }

        //Function chaining

        Function<Integer,Integer> f4=i->i*2;
        Function<Integer,Integer> f5=i->i*i*i;
        System.out.println(f4.andThen(f5).apply(2));
        System.out.println(f4.compose(f5).apply(2));

    }
}
