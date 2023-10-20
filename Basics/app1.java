import java.util.Scanner;
public class app1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Plese Enter your age : ");
        int age = scn.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting");
        }  
        else
        {
            System.out.println("You are not eligible for voting");
        }  

    }
}
