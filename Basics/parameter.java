import java.util.Scanner;

public class parameter {

        static void age(int age)
        {
            System.out.println("Your age is : "+age);
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = scn.nextInt();
        age(age);
    }
    
}
