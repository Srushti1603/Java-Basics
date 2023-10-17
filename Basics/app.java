import java.util.Scanner;
public class app {
    public static void main(String[] args) {
      System.out.println("Enter your details ");

      Scanner input = new Scanner(System.in);

      System.out.println("Enter your age - ");  
      int age = input.nextInt();
      System.out.println("My age is : "+age);

      System.out.println("Enter your Roll no - ");  
      double Rn = input.nextDouble();
      System.out.println("My Roll number is : "+Rn);  
                                  
      System.out.println("Are you enrolled (true/false)? ");  
      boolean enrolled = input.nextBoolean();
      System.out.println("Enrolled : "+enrolled);
    }
   
}
