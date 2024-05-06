
class Student{
    String Name;
    String semester ;
    Student(String x,String y){
        Name = x;
        semester =y;
    }
    Student(Student s){
        Name = s.Name;
        semester = s.semester;
    }
    void display(){
        System.out.println(Name);
        System.out.println(semester);
    }
}
public class easy_copyconstructor {
    public static void main(String[]args){
        Student obj = new Student("Aronyo","5th");
        obj.display();
    }
}
