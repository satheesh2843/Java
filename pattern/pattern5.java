package pattern;
import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i%2!=0 && j%2!=0)||(i%2==0 && j%2==0)) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
