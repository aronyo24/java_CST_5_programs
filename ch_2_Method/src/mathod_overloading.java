class math{
    int a,b,c;
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
        math obj1 = new math();
        obj1.calculation(7,8,9);
        obj1.calculation(9,7);
    }
}
