package JavaFeatures;

interface Left{
    default void m1(){
        System.out.println("Left");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right");
    }
}
public class DefaultMethods implements Left,Right{
    //used to resolve multiple inheritance diamond problem in java
    @Override
    public void m1() {
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethods m=new DefaultMethods();
        m.m1();
    }
}
