package JavaFeatures;

//Method reference:
//method reference - alternative to lambda expressions
//using :: operator
//instead of writing the implementation of implementing class method call method e.g. below
//if static method, classname::methodname
//if nonstatic method, objectname::methodname
class Test
{
    public void m1()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("CHILD NON STATIC THREAD");
        }
    }

    public static void m2()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("CHILD STATIC THREAD");
        }
    }
}

class Sample
{
    Sample()
    {
        System.out.println("This is sample class constructor");
    }
}

interface SampleInterface
{
    public Sample get();
}

public class MethodConstructorReference
{
    public static void main(String[] args)
    {
        //here instead of writing implementation of run() as a lambda method we'll call m1/m2
        Runnable r1=Test::m2;
        Test t1=new Test();
        Runnable r2=t1::m1;
        Thread t=new Thread(r1);
        t.start();

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main thread");
        }
    }

    //If the implementation is already available, go for method reference
    //If the implementation is not available, go for constructor reference
    //method reference gives code reusability

    //constructor reference:
    //if returns object then cons ref

    //constructor reference
    SampleInterface i=Sample::new;
    Sample s1=i.get();
    Sample s2=i.get();
}
