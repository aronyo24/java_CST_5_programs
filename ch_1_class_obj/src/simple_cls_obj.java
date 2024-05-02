import java.util.Scanner;
class sum{

    public void sum(int a,int b){
        int sum =a+b;
        System.out.print(sum);
    }
}

public class simple_cls_obj {
    public static void main (String[]args){
        sum obj = new sum ();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int x=input.nextInt();
        System.out.print("Enter the value of a:");
        int y=input.nextInt();
        System.out.print("Enter the value of b:");

        obj.sum(x,y);


    }
}
