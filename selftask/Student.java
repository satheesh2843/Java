package selftask;

public class Student {
    int id,mark;
    String name,department;
    int getId(){
        return id;
    }
    int getMark(){
        return mark;
    }
    String getName(){
        return name;
    }
    String getDepartment(){
        return department;
    }
    void setId(int id){
        this.id=id;
    }
    void setMark(int mark){
        this.mark=mark;
    }
    void setName(String name){
        this.name=name;
    }
    void setDepartment(String department){
        this.department=department;
    }
    @Override
    public String toString() {
        return id + "," + name + "," + department + "," + mark;
    }

}
class GraduateStudent extends Student{
    String projectTitle;
    String getProjectTitle() {
        return projectTitle;
    }

    void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }


}
