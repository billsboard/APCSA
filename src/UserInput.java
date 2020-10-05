import java.util.Random;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a variable called type Scanner, and tell it to read from System.in

        int num;
        System.out.print("Enter an integer: ");
        num = scan.nextInt(); // Read one integer from System.in through the Scanner

        System.out.println("You entered " + num);
        // Note if you don't enter an integer the code will fail


        double d;
        System.out.print("Enter a decimal number: ");
        d = scan.nextDouble();
        System.out.println("You entered " + d);


        /*
        To scan Strings use scan.nextLine()
        */


        /*
        Challenge exercise:
        Generate 2 random numbers for the user to add.
        If they get it right, output congratulations, else make them keep guessing
         */


        System.out.println("\nChallenge Exercise");

        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        System.out.print(x + " + " + y + " = ");
        int z = scan.nextInt();
        while (z != x + y){
            System.out.print("Try again: ");
            z = scan.nextInt();
        }
        System.out.println("Congratulations!");



    }
}
