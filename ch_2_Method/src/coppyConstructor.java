class add {
    int a, b, c;
    add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int sum = a + b + c;
        System.out.println(sum);
    }
    add(add up) {
        this.a = up.a;
        this.b = up.b;
        this.c = up.c;
        int sum = up.a - up.b - up.c;
        System.out.println(sum);

    }
}
public class coppyConstructor {
    public static void main(String[]args){
        add obj = new add(4,6,7);
        add obj1= new add(obj);
        add obj2= new add(obj1);

    }
}
