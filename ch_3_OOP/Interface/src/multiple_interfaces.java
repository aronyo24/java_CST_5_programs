import java.util.Scanner;
interface mul{
    void multiplication();
}
interface  div{
    void division();
}
class calculation implements mul,div {
    Scanner input = new Scanner(System.in);
    int a,b;
    calculation(){
        System.out.print("Enter the value of a: ");
         a = input.nextInt();
        System.out.print("Enter the value of b: ");
         b = input.nextInt();
    }
    public void multiplication(){


        double mul = a*b;
        System.out.println(mul);
    }
    public void division(){

        double div = a/b ;
        System.out.println(div);
    }

}
public class multiple_interfaces {
    public static  void  main(String[]args){
        calculation obj = new calculation();
        obj.multiplication();
        obj.division();
    }


}
