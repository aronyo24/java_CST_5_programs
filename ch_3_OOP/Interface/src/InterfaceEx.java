
import java.util.Scanner;
interface add {
    void submition();
}
class sum implements add {
    public void submition() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
         int a = input.nextInt();
        System.out.print("Enter the value of b: ");
         int b = input.nextInt();
        System.out.print("Enter the value of c: ");
         int c = input.nextInt();

        // Calculate and print the sum
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
       sum obj =new sum();
       obj.submition();

    }
}