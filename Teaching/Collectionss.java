package Teaching;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionss {


        public static void main(String[] args) {
            int arr[] = {1,2,43,5314,53,34};
      ArrayList <Integer> obj = new  ArrayList();
      obj.add(123);
      obj.add(321);
      obj.add(789);
      obj.add(741);
      obj.add(456);
      obj.add(321);
            Collections.sort(obj);
            System.out.println(obj);
      List<Integer> k = obj.subList(0,3);
            System.out.println(k);
      ArrayList <Integer> obj1 = new  ArrayList();
            obj1.add(123);
            obj1.add(321);
            obj1.add(789);
            obj1.add(741);
            obj1.add(456);
            obj1.add(321);
            obj1.set(2,45);
            obj1.addAll(obj);
            obj.remove(2);
            System.out.println(obj);
            System.out.println(obj1);
            for(int i=0;i<obj.size();i++){
                System.out.println(obj.get(i));
            }
//            for(int k :obj1 ){
//                System.out.println(k);
//            }
    }
}
