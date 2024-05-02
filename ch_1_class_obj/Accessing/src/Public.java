import java.util.Scanner;
class Student{

    //public
    public String name;
    public int roll;

    //protacted
    protected int semister;
    protected String department;
    //private
    private String email;
    private int number;
    void display (){
        System.out.println("name :"+name);
        System.out.println("roll :"+roll);
        System.out.println("semister :"+semister);
        System.out.println("department :"+department);
        System.out.println("email :"+email);
        System.out.println("number :"+number);
    }
    Student(String email,int number){
        this.email = email;
        this.number = number;


    }
}

public class Public {
    public static void main(String[] args) {
        Student obj = new Student("aronyom22@gmail.com",1917777);
        obj.roll = 634481;
        obj.name = "Aronyo";
        obj.semister = 4;
        obj.department = "Computer";

        obj.display();
    }
}