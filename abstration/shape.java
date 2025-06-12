package abstration;

abstract public class shape {
    abstract int calculatearea(int n);
    abstract int calculateperimeter(int n);
}
class circle extends shape{
    int calculatearea(int n){
        int value=(22/7)*n*n;
        return value;
    }
    int calculateperimeter(int n){
        int value=2*(22/7)*n;
        return value;
    }
}
class triangle extends shape{
    int calculatearea(int n){

        return (int) (0.5*n*n);
    }
    int calculateperimeter(int n){

        return n+n+n;
    }
}
class calutevalue{
    public static void main(String[] args) {
        circle obj=new circle();
        triangle obj1=new triangle();
        System.out.println(obj.calculatearea(5));
        System.out.println(obj.calculateperimeter(9));
        System.out.println(obj1.calculatearea(5));
        System.out.println(obj1.calculateperimeter(7));


    }
}
