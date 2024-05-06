import java.awt.geom.Area;

class Math{
    public void Area (int length,int width){
        int area = length * width;
        System.out.println("Area of rectangle :"+ area);
    }
}
class SubMath extends Math{
    public void Area (int Side){
        int area = Side*Side;
        System.out.println("Area of Squire :"+ area);
    }
}
public class method_overriding {
    public static void main (String[]args){
        SubMath obj1 = new SubMath();
        obj1.Area(56,77);
        obj1.Area(56);
    }
}
