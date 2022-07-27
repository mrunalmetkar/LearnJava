package JavaFeatures;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFI {
    //doesn't take any input
    //predef FI
    //has get() method
    public static void main(String[] args) {
        Supplier<Date> s =()->new Date();
        System.out.println(s.get());;

        Supplier<Double> s1=()->{
          double otp=  Math.random();
          return otp;
        };
        System.out.println(s1.get());
    }
}
