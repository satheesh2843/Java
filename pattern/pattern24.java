package pattern;
import java.util.*;
public class pattern24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p*(i-j)/j;
            }
            System.out.println();
        }
    }
}
