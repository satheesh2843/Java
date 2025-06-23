package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();

        // "list.add(element)" --> used to add the element in last of array list
        a.add(89);
        a.add(123);
        a.add(324);
        a.add(352);
        a.add(9866);
        a.add(235);
        a.add(879);
        a.add(32234);

        // we can simple print the object of array list to print all the element in arraylist
        System.out.println(a);
        // " list.add(index, element) " -->  used to add element in specific index of array list

        a.add(0,79);
        System.out.println(a);

        // " list.get(index)" --> it is used to get the specific index value in  array list
        System.out.println(a.get(2));
        System.out.println(a);

        // "list.set(index,value) --> it is used to set the value in specific index
        a.set(1,876);
        System.out.println(a);

        // "list.remove(index) --> remove specific index value in the arrayList
        // "list.remove(object) --> remove the value in another object value in this object
        a.remove(2);
        System.out.println(a);

        //list.clear() --> it is used to remove all the element in arraylist
//        a.clear();
//        System.out.println("arraylist value -->"+a);

        // "list.size()" --> it is used to get the size of the arraylist
        System.out.println(a.size());

        // list.isEmpty()
        System.out.println(a.isEmpty());

        
    }
}
