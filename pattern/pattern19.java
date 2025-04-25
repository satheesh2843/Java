package pattern;
import java.util.*;
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            int p=n-i+1;
            for(int j=0;j<i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            int p=n-i+1;
            for(int j=0;j<i;j++){
                System.out.print(p+++" ");
            }
            System.out.println();
        }
    }
}

