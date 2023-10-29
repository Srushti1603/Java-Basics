import java.util.Scanner;
public class fact {
    static int fact(int no)
    {
        int fac = 1;
        for(int i=1;i<=no;i++)
        {
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int no = scn.nextInt();
        System.out.println("Factorial is " +fact(no));
    }
}
