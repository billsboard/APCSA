import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For {
    public static void main(String[] args) throws IOException {

        /*
        for(int i = [START], i < [END], i++ [STEP)
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
            // i is within score here, so redefining i here causes an error
        }
        System.out.println();

        // i is only valid within the for loop. It is out of scope here:
        // i = 10 // Error
        int i = 10;

        // The increment on the for loop (the STEP) can be changed
        for (int j = 0; j < 10; j += 2) {
            System.out.println("j is " + j);
        }
        System.out.println();


        /*
        for (int k = 0; k < 10; k -= 2) {
            System.out.println("k is " + k);
        }

        Since subtracting from k will cause k to be always less than 10, this will cause the for loop
        to run forever (or until integer overflow)
        */

        for (int k = 10; k > 0; k--) {
            System.out.println("k is " + k);
        }
        System.out.println();


        // Exercise: Print out all the numbers between 50 and 100 (inclusive) that are divisible by 5
        for (int l = 50; l <= 100; l += 5){
            System.out.println(l + " is divisible by 5");
        }
        System.out.println();


        // Fizzbuzz problem
        for (int m = 1; m <= 100; m++) {
            if(m % 15 == 0) System.out.print("FizzBuzz ");
            else if(m % 5 == 0) System.out.print("Buzz ");
            else if(m % 3 == 0) System.out.print("Fizz ");
            else System.out.print(m + " ");
        }
        System.out.println("\n");


        // Exercise: Ask the user to enter a positive int, and print all odd numbers from 1 to that number
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a positive integer: ");
        int n = Integer.parseInt(in.readLine());
        for (int j = 1; j <= n; j+=2) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        // Exercise: Check if a number is prime
        System.out.print("Enter a positive integer: ");
        int x = Integer.parseInt(in.readLine());
        System.out.println(isPrime(x) ? x + " is a prime number" : x + " is a composite number");
        System.out.println();

        // Exercise: Factorial a number
        System.out.print("Enter a positive integer: ");
        int y = Integer.parseInt(in.readLine());
        long p = 1;
        for (int j = y; j > 1; j--) {
            p *= j;
        }
        System.out.println(p + "\n");
    }


    static boolean isPrime(int x){
        if(x % 2 == 0) return false;
        for (int i = 3; i < (int) Math.sqrt(x); i += 2) {
            if(x % i == 0) return false;
        }
        return true;
    }
}
