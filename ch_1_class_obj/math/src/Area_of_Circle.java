import java.util.Scanner;
class Area{
    public int r;
    public void Area_C(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of r :");
        r = input.nextInt();
        double area = 3.1315*r*r;
        System.out.print("Enter the value of Area of Circle :"+area);

    }
}
public class Area_of_Circle {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.Area_C();
    }
}