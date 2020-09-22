package math;

public class Modulo {
    public static void main(String[] args) {
        // Modulo (%) is the remainder for a division

        System.out.println(10 % 4);
        // Prints 2 because 10 / 4 = 2 R2

        System.out.println(1 % 5);
        // Returns 1 because 1 / 5 = 0 R1

        System.out.println(40 % 40);
        // Returns 0 since 40 is divisible by 40


        // Do not use mod for non-integer numbers
        System.out.println(2.5 % 3);

        System.out.println();


        // We can use mod to check divisibility

        // Exercise 1: print out any three digit number as separate digits using / and mod
        int x = 123;
        System.out.println("Exercise 1:");
        System.out.print(x / 100 + " ");
        System.out.print(x % 100 / 10 + " ");
        System.out.println(x % 100 % 10);

        // Exercise 2: given the number of hours, print out how many days and hours
        int h = 51;
        System.out.println("\nExercise 2:");
        System.out.print(h/ 24 + " days, " + h % 24 + " hours");

    }
}
