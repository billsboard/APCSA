package assignments;

import java.util.Random;
import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Question 1
        System.out.print("Question 1. Enter a number: ");
        double t;
        if((t = scan.nextDouble()) > 100) System.out.println("Greater than 100");
        else if(t == 100) System.out.println("Equal to 100");
        else System.out.println("Less than 100");
        System.out.println();

        // Question 2
        System.out.print("Question 2. Enter a string: ");
        scan.nextLine(); // Scanner quirk with reading numbers. Need to eat an empty line after reading number
        if(scan.nextLine().equals("password")) System.out.println("Correct");
        else System.out.println("Incorrect");
        System.out.println();

        // Question 3
        System.out.print("Question 3. Enter an integer: ");
        double x = Math.sqrt(scan.nextInt());
        if(x == Math.floor(x)) System.out.println("Is perfect square");
        else System.out.println("Is not perfect square");
        System.out.println();

        // Question 4
        System.out.print("Question 4. Enter an integer: ");
        if(scan.nextInt() % 3 == 0) System.out.println("Divisible by 3");
        else System.out.println("Not divisible by 3");
        System.out.println();

        // Question 5
        System.out.print("Question 5. Enter an integer: ");
        int y = scan.nextInt();
        if(y % 35 == 0) System.out.println("Divisible by 5 and 7");
        else if(y % 7 == 0) System.out.println("Divisible by 7");
        else if(y % 5 == 0) System.out.println("Divisible by 5");
        else System.out.println("Not divisible by 5 or 7");
        System.out.println();

        // Question 6
        System.out.print("Question 6. Enter a double: ");
        double z = scan.nextDouble();
        if(z > 100 || z < 0) System.out.println("Error");
        else if(z < 60) System.out.println("F");
        else if(z < 75) System.out.println("C");
        else if(z < 86) System.out.println("B");
        else System.out.println("A");
        System.out.println();

        // Question 7
        System.out.print("Question 7: Enter an integer: ");
        int c = scan.nextInt();
        if(c == 0) System.out.println("Zero");
        else {
            String s = "";
            if ((c & 0b10000000000000000000000000000000) == 0b10000000000000000000000000000000) s += "Negative ";
            else s += "Positive ";
            if (c % 2 == 0) s += "even number";
            else s += "odd number";
            System.out.println(s);
        }
        System.out.println();

        // Question 8
        System.out.print("Question 8. Enter an integer x such that 1 <= x <= 100: ");
        Random rand = new Random();
        int a = rand.nextInt(100) + 1, b = scan.nextInt();
        System.out.println("Computer picked: " + a + ". You guessed: " + b);
        System.out.println(a > b ? "Computer picked a greater number" : a == b ? "It was a tie" : "You picked the greater number");
        System.out.println();

        // Question 9
        System.out.print("Question 9. Enter three numbers: ");
        System.out.println("Largest number: " + Math.max(Math.max(scan.nextInt(), scan.nextInt()), scan.nextInt()));
        System.out.println();

        // Question 10
        System.out.print("Question 10. Enter two numbers: ");
        System.out.println("The last digits of each number are " + (scan.nextInt() % 10 == scan.nextInt() % 10 ? "" : "not ") + "equal.");
    }
}
