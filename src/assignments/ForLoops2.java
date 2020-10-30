package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoops2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Question 1
        System.out.println("Question 1. Enter a number");
        int x = Integer.parseInt(in.readLine());
        for (int i = 1; i <= x; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Question 2
        System.out.println("Question 2. Enter numbers to average. Enter -1 to end");
        int y = 0, z = 0, a;
        while ((a = Integer.parseInt(in.readLine())) !=  -1){
            if(a != -1){
                y += a;
                z += 1;
            }
        }
        System.out.println(String.format("Your average is %.2f for your %d numbers", (double) y / z, z));
        System.out.println();

        // Question 3
        System.out.println("Question 3. Enter an integer n");
        int n = Integer.parseInt(in.readLine());
        double m = 0;
        for (int i = 1; i <= n; i++) {
            m += 1.0 / i;
        }
        System.out.println("Harmonic of " + n + " is " + m);
    }
}
