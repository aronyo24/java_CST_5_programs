import java.util.Scanner;
public class ExpectionHandeling {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of x:");
            int x = input.nextInt();
            System.out.print("Enter the value of y:");
            int y = input.nextInt();
            double z = x/y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }finally {
           System.out.println("program excuted");
       }
        try {
            String str =null;
            System.out.println(str.charAt(0));
        }catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}