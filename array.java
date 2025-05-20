import java.util.*;
public class array {
//    int sortt(int []a){
//
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={454,23,123,12,324,54,231};

        for(int i=0;i<5;i++)
            System.out.println(a[i]);

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
