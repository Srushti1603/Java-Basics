import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number ");
        int no = scn.nextInt();

        switch(no)
        {
            case 1:
            System.out.println("Hamburger");
            System.out.println("Please wait for 15 minutes");
            break;

            case 2:
            System.out.println("Pizza");
            System.out.println("Please wait for 15 minutes");
            break;

            case 3:
            System.out.println("Cold Coffee");
            System.out.println("Please wait for 15 minutes");
            break;

            case 4:
            System.out.println("Pani Puri");
            System.out.println("Please wait for 15 minutes");
            break;

            case 5:
            System.out.println("Itallian Food");
            System.out.println("Please wait for 15 minutes");
            break;

            case 6:
            System.out.println("Paneer Tikke");
            System.out.println("Please wait for 15 minutes");
            break;

            case 7:
            System.out.println("Puran Poli");
            System.out.println("Please wait for 15 minutes");
            break;

            default:
            System.out.println("Sorry, Please visit again we are unable to serve you this item.");
        }
    }
    //default dosen't have a break statement
}
