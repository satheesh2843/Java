package collections;

import java.util.*;

public class User {
    static int a= 1;
    static void m(){
        System.out.println("Hello world "+a);
        if(a<=100) {
            a++;
            m();

        }


         }
         static int get1(int arr[] ,int index){
        int k=0;
         for(int i=0;i<arr.length;i++){
             if(i==index){
                 k=i;
             }
         }
         return arr[k];
         }
    public static void main(String[] args) {
        int arr []  = {2,4,3,5,23,56};
        System.out.println( get1(arr,2));
       LinkedList<Integer> obj = new LinkedList<>();
        obj.add(123);
        obj.add(987);
        obj.add(963);
        obj.add(741);
        obj.add(781);
        int k = obj.get(1);


       Iterator obj1 = obj.descendingIterator();
       while(obj1.hasNext()){
           System.out.println(obj1.next());

       }

//        Scanner sc=new Scanner(System.in);
//        ArrayList<Integer> a=new ArrayList<>();
//        while(true){
//            int aa=sc.nextInt();
//            if(aa==-1)
//                break;
//            a.add(aa);
//        }
//
//        System.out.println(a);
    }
}



