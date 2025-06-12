package innerclass;

public class College {
    static class Department{
        void ECE(){
            String dep_name="ECE";
            int student_count=69;
            System.out.println("ECE details");

        }
        void EEE(){
            String dep_name="ECE";
            int student_count=69;

                System.out.print("EEE details-->");
                System.out.print(student_count);
                System.out.print(dep_name);

        }
        void CSE(){
            String dep_name="ECE";
            int student_count=69;
            System.out.println("CSE details");

        }
    }

    public static void main(String[] args) {
        College obj=new College();
        College.Department obj1=new College.Department();
        obj1.CSE();
        obj1.ECE();
        obj1.EEE();
    }
}
