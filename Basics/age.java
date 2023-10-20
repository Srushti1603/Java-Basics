import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int age = 18;
        if(age<18)
        {
            System.out.println("You are minor");
        }

        else if(age>=18 && age<65)
        {
            System.out.println("You are adult");
        }
        
        else
        {
            System.out.println("You are senior citizens");
        }
    }
}
