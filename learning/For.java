package learning;

public class For {
    public static void main(String[] args){
        int n=10,f=0,f1=1,f2=1;
        for(int i=0;i<10;i++){
            System.out.print(f+" ");
            f=f1;
            f1=f2;
            f2=f+f1;
        }

    }
}
