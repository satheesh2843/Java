package pattern;
import java.util.*;
public class pattern23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i || i==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i || i==n-1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
