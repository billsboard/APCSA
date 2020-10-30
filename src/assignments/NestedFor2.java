package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedFor2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Question 1
        System.out.println("Question 1");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " / " + j + " = " + (double) i / j);
            }
        }
        System.out.println();

        // Question 2
        System.out.println("Question 2. Enter two numbers:");
        int x = Integer.parseInt(in.readLine()), y = Integer.parseInt(in.readLine()), gcf = 0;
        for (int i = 1; i <= Math.min(x, y); i++) {
            if(x % i == 0 && y % i == 0) gcf = i;
        }
        System.out.println("GCF is " + gcf + "\n");

        // Question 3
        System.out.println("Question 3. Enter a number:");
        int z = Integer.parseInt(in.readLine());
        int fac = 0;
        for (int i = 1; i < z; i++) {
            if(z % i == 0) fac += i;
        }
        System.out.println(fac == z ? "Is perfect\n" :  "Is not perfect\n");

        // Question 4
        System.out.println("Question 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
            System.out.println(i + 1);
        }
        System.out.println();

        // Question 5
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(10 - j);
            }
            System.out.println();
        }

    }
}
