package assignments; // Remove this line if you are running this code on your own computer.

import java.util.Random;

public class MathOperations {
    public static void main(String[] args) {

        Random rand = new Random(); // Create Random() object for questions 7-10 and 15

        // Question 1
        System.out.println("Question 1:");
        System.out.println(3 - 48 * 23 + 16 / 10);

        // Question 2
        System.out.println("Question 2:");
        System.out.println(12 % 7);

        // Question 3
        System.out.println("Question 3:");
        System.out.println(Math.pow(2, 0.5));

        // Question 4
        System.out.println("Question 4:");
        System.out.println(Math.pow(7, 42));

        // Question 5
        System.out.println("Question 5:");
        System.out.println(Math.abs(-50));

        // Question 6
        System.out.println("Question 6:");
        System.out.println((-2 + Math.pow(8, 0.5)) * Math.pow(14, 3));

        // Question 7
        System.out.println("Question 7:");
        System.out.println("Note: One Random() object was created at the top of the code, with " +
                "name \"rand\". This object will be used for questions 7-10.");
        System.out.println(rand.nextInt(10) + 1);

        // Question 8
        System.out.println("Question 8:");
        System.out.println(rand.nextInt(7001) + 1000);

        // Question 9
        System.out.println("Question 9:");
        System.out.println(rand.nextInt(76) + 25);

        // Question 10
        System.out.println("Question 10:");
        System.out.println(rand.nextInt(10));

        // Question 11
        System.out.println("Question 11:");
        int celsius = 28;
        System.out.println(((double) celsius * 9.0/5.0) + 32);

        // Question 12
        System.out.println("Question 12:");
        long seconds = 38800;
        System.out.println((double) seconds / (60 * 60 * 24) + " days");

        // Question 13
        System.out.println("Question 13:");
        int miles = 500;
        System.out.println((double) miles * 1.609344 + " kilometers");

        // Question 14
        System.out.println("Question 14:");
        int feet = 5; int inches = 3;
        inches += feet * 12;
        System.out.println((double) inches * 2.54);

        // Question 15
        System.out.println("Question 15:");
        System.out.println("Question did not specify if bound is inclusive or not. Therefore the range 100 <= x < 150 will be used.");
        System.out.println((double) (rand.nextInt(50) + 100) * 0.45359237);
    }
}
