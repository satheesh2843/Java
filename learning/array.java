package learning;
import pattern.pattern1;
import java.util.*;
public class array {
    static int[][] print(int[][]a){
//        System.out.println(Arrays.toString(a[0]));
        a[0][0]=90;
//        System.out.println(Arrays.toString(a[0]));
        return a;
    }
//    static  void print(ArrayList list){
////        System.out.println(list);
//    }
    public static void main(String[] args) {
        int[][]a={{1,2,3,4,5},{1,2,3,4},{1,2,3,4}};
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
//        print(list);
        System.out.println(Arrays.toString(a[0]));

        print(a);
        System.out.println(Arrays.toString(a[0]));
        pattern1 obj = new pattern1();
        obj.Hello(5);
    }
}
