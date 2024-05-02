import java.util.Scanner;

class Math {
    int a, b, c;

    public void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = input.nextInt();
        System.out.print("Enter the value of b:");
        b = input.nextInt();
        System.out.print("Enter the value of c:");
        c = input.nextInt();
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }
}

class Math1 extends Math {
    public void sub() {
        int sub = a - b - c;
        System.out.println("Subtraction: " + sub);
    }
}

class Math2 extends Math1 {
    public void mul() {
        int mul = a * b * c;
        System.out.println("Multiplication: " + mul);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Math2 obj = new Math2();
        obj.sum();
        obj.sub();
        obj.mul();
    }
}
