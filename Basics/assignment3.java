import java.util.Scanner;


public class assignment3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        double a = scn.nextDouble();
        double b= scn.nextDouble();
        System.out.println("Enter operator from ['+','-','*','/']:");
        char op = scn.next().charAt(0);

        switch (op)
        {
            case '+':
                System.out.println("Addition is " +(a + b));
                break;

            case '-':
                System.out.println("Substraction is " +(a - b));
                break;    

            case '*':
                System.out.println("Multiplication is " +(a * b));
                break;
                
            case '/':
                System.out.println("Division is " +(a / b));
                break;    

            default:
                System.out.println("XXXXX Entered operator is invalid! XXXXX");    
        }

    }
    
}
