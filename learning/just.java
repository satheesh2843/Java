package learning;

import java.util.*;
public class just{
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        int[][]b=new int[3][3];
        int [][]d={
                {1,2,3,4},
                {6,7,7},
                {1}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}