//package Teaching;
//
//import java.io.*;
////
////public class Stark implements Serializable{
////    int id ;
////    String name;
////
////    public Stark(int id, String name, String place, String phno) {
////        this.id = id;
////        this.name = name;
////        Place = place;
////        Phno = phno;
////    }
////
////    String Place;
////    String Phno;
////    public static void main(String[] args) throws IOException,Exception {
//////    Stark obj = new Stark(12,"Sathish","Coimbatore","7521542145");
////////        ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream("Emplyee"));
////////        obj1.writeObject(obj);
////////        obj1.close();
//////        FileInputStream obj2 = new FileInputStream("Emplyee");
//////        ObjectInputStream obj1 = new ObjectInputStream(obj2);
//////        Stark s = (Stark) obj1.readObject();
//////        System.out.println(s.id+s.name+s.Place+s.Phno);
//////        int k = Hello();
//////        float n = obj.K();
////        String s1= "MadaM";
////        System.out.println(s1.substring(0,2));
////        String s2 = reverse(s1);
////        if(s2.equals(s1)){
////            System.out.println("Palindrome");
////        }
////        else {
////            System.out.println("Not a Palindrome");
////        }
////        System.out.println(s2);
////    }
////    public static int Hello(){
////        return 10+20;
////    }
////    float K (){
////        return 1.654f;
////    }
////   static String reverse(String s){
////        String s1 = "";
////        for(int i=s.length()-1;i>=0;i--){
////            s1+=s.charAt(i);
////        }
////        return s1;
////    }
////},,,,package
//
//
//class Student {
//    String name;
//    int age;
//
//    // Constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Method that returns a Student object
//    static Student createStudent() {
//        // create and return a new Student object
//        return new Student("Satheesh", 21);
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        // Calling the method and storing the returned object
//        Student s = Student.createStudent();
//        s.display();class Student {
//            String name;
//            int age;
//
//            // Constructor
//            Student(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//
//            // Method that returns a Student object
//            static Student createStudent() {
//                // create and return a new Student object
//                return new Student("Satheesh", 21);
//            }
//
//            void display() {
//                System.out.println("Name: " + name);
//                System.out.println("Age: " + age);
//            }
//
//            public static void main(String[] args) {
//                // Calling the method and storing the returned object
//                Student s = Student.createStudent();
//                s.display();
//            }
//        }
//
//    }
//}
//
//class hel{
//    public static void main(String[] args) {
//        System.out.println("hi");
//    }
//}