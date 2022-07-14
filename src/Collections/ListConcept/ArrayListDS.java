package Collections.ListConcept;

import java.util.ArrayList;

public class ArrayListDS {

    //1. Dynamic datastructure
    //2. not synchronized, not thread safe
    //3. maintains insertion order
    //4. can be randomly accessed as it uses indexes internally
    //5. both generic nd nongeneric
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();  //nongeneric
        arrayList.add("A");
        arrayList.add(12);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<Integer> arrayList1=new ArrayList<Integer>(); //Generic

        //can also store a class object in arraylist
        //Arraylist<Employee> arr=new ArrayList<Employee>();
        //arr.add(e1); arr.add(e2);    e1 and e2 are Employee class objects
    }
}
