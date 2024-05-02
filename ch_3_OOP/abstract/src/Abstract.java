
abstract class Collage{
    abstract void department ();
    public void Clg_Name(){
        System.out.println("Jashore Polytechnic  ");
    }

}
class jashore extends Collage{
    public void department(){
        System.out.println("Computer Science & Technology");
    }
}

public class Abstract {
    public static void main(String[] args) {
        jashore obj = new jashore();
        obj.department();
        obj.Clg_Name();
    }
}