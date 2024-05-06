class Math1{
   // int a,b,c;
    public void calculation(int a,int b,int c){
        int mul = a*b*c;
        System.out.println(mul);

    }
    public void calculation(int a,int b){
        int mul = a*a*b;
        System.out.println(mul);

    }
}
public class mathod_overloading {
    public static void main(String[]args){
        Math1 obj1 = new Math1();
        obj1.calculation(7,8,9);
        obj1.calculation(9,7);
    }
}
