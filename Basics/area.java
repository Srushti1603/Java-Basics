import java.util.Scanner;
public class area{
    static double fun(double r)
    {
          double area = 3.14*r*r;
          return area;
    }
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter value of radius ");
        double r = Scn.nextDouble();
        System.out.println("Area is :" +fun(r));
     
    }
}