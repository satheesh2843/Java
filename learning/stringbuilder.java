package learning;

public class stringbuilder {
    public static void main(String[] args) {

                StringBuilder obj=new StringBuilder ("satheesh");
                // "append" this keyword used to add two  strings
                obj.append(" kumar");
                System.out.println(obj);

                // "insert" this keyword used to insert one string to another string
                obj.insert(14," the king!!");
                System.out.println(obj);

                //"replace" this keyword used to replace the string from the specific postion
                obj.replace(14, 21, " devil");
                System.out.println(obj);

                // "delete" this keyword used to delete the character in specific position
                obj.delete(14 , 25);
                System.out.println(obj);

                // "reverse" this keyword used to reverse the full strings
                System.out.println(obj.reverse());

    }
}
