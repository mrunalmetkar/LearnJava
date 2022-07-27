package JavaFeatures;

import java.util.function.Consumer;

class Student
{
    int sAge;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "sAge=" + sAge +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int sAge, String name)
    {
        this.sAge = sAge;
        this.name = name;
    }
}

class movie
{
    String name;

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                '}';
    }

    public movie(String name) {
        this.name = name;
    }
}
public class ConsumerFI {
    //consumer predefined FI
    //has accept method
    //void return type
    //mostly used when we have to print
    public static void main(String[] args) {

        Consumer<String> c1=s-> System.out.println(s);
        c1.accept("Hello");

        Student[] students={new Student(12,"abc"),new Student(13,"bsq")};
        Consumer<Student> c2=s-> System.out.println(s);
        for (Student st:students)
        {
            c2.accept(st);
        }

        //consumer chaining
        Consumer<movie> m1=m-> System.out.println(m+"Hello Friends");
        Consumer<movie> m2=m-> System.out.println(m+"Hello Friends");
        Consumer<movie> m3=m-> System.out.println(m+"Hello Friends");

        Consumer<movie> cc=m1.andThen(m2).andThen(m3);
        cc.accept(new movie("ABS"));

    }
}
