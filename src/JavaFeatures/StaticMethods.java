package JavaFeatures;

interface Interf{
     public static void method(){
            System.out.println("Call static interface method using Interface");
    }
}
public class StaticMethods implements Interf{
    //interface static methods are not present in implementor class by default
    //we have to call interface static method using Interface
    //as static stuff doesn't need class object to call, no need to create object to call method()

    public static void main(String[] args) {
        Interf.method();
    }

}
