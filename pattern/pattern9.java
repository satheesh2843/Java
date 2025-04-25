package pattern;
import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
//        System.out.print("--------");
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>i-1;j--)
                System.out.print("* ");
            System.out.println();
        }

    }
}
