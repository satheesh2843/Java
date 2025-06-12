package innerclass;

public class library {
    private String bookname="the book";

    class book{
        void toshow(){
            System.out.println(bookname);
        }
    }
    public static void main(String[] args) {
        library obj=new library();
        library.book obj1=obj.new book();
        obj1.toshow();
    }
}
