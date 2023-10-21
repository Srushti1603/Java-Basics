import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Time : ");
        int time = scn.nextInt();
        if(time>0 && time<=12)
        {
            System.out.println("Good Morning!");
        }
        else if(time>12 && time<=18)
        {
            System.out.println("Good Afternoon!");
        }
        else
        {
            System.out.println("Good Evening!");
        }
    }
    
}
