package pattern;
import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
