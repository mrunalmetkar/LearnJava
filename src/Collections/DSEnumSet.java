package Collections;

import java.util.EnumSet;
import java.util.Iterator;

public class DSEnumSet {

    //faster, not thread safe
    //faster than hashset
    //all operations performed using bitwise operations

    enum Lang{
        JAVA, PYTHON, DSA, DS
    }
    public static void main(String[] args) {

        //full enum
        EnumSet<Lang> e= EnumSet.allOf(Lang.class);
        System.out.println(e);

        //empty enumset
        EnumSet<Lang> e1=EnumSet.noneOf(Lang.class);
        System.out.println(e1);

        //range
        EnumSet<Lang> e2=EnumSet.range(Lang.JAVA,Lang.DSA);
        System.out.println(e2);

        //of
        EnumSet<Lang> e3=EnumSet.of(Lang.DS);
        System.out.println(e3);

        //add and add all
        EnumSet<Lang> e4=EnumSet.of(Lang.DS);
        e4.add(Lang.JAVA);
        System.out.println(e4);

        //can print using Iterator
        EnumSet<Lang> e5=EnumSet.allOf(Lang.class);
        Iterator<Lang> it=e5.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
