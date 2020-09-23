package math;

public class MathOperators {
    public static void main(String[] args) {

        // Absolute Value
        System.out.println(Math.abs(-2));

        // Sqrt and power
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(2));

        // Random: Generate a decimal number between 0 (inclusive) and 1 (exclusive)
        System.out.println(Math.random());



        // Exercise: Create a random number generator algorithm that can generate between a low and high bound (inclusive)
        System.out.println();
        System.out.println("Exercise 1:");

        int low = -4;
        int high = 4;

        int randGen =  (int) (Math.random() * (high + 1 - low) + low); // high + 1 to make high bound inclusive
        System.out.println(randGen);

    }
}
