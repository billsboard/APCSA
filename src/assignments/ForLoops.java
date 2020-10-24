package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x, y, z;


        //Question 1
        System.out.println("Question 1");
        for (int i = 99; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Question 2
        System.out.println("Question 2");
        for (int i = 12; i <= 100; i += 12) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Question 3
        System.out.println("Question 3");
        for (int i = 500; i <= 1000; i++) {
            System.out.print((i % 10 == 0 ? 2 * i : i) + " ");
        }
        System.out.println("\n");

        //Question 4
        System.out.println("Question 4. Enter a number less than 10");
        x = Integer.parseInt(in.readLine());
        for (int i = 10; i >= x; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        //Question 5
        System.out.println("Question 4. Enter two numbers between 1 and 100 (Separate lines please)");
        x = Integer.parseInt(in.readLine()); y = Integer.parseInt(in.readLine());
        for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Question 6
        System.out.println("Question 6. Enter two numbers between 1 and 100 (Separate lines please)");
        x = Integer.parseInt(in.readLine()); y = Integer.parseInt(in.readLine());
        for (int i = 1; i <= 100; i++) {
            System.out.print((i == x || i == y) ? "" : i + " ");
        }
        System.out.println("\n");

        //Question 7
        System.out.println("Question 7. Enter a number between 1 and 100");
        x = Integer.parseInt(in.readLine());
        if((x & 1) == 0) System.out.println("Not prime");
        else {
            boolean ok = true;
            for (int i = 3; i < Math.sqrt(x); i += 2) {
                if(x % i == 0){
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "Prime" : "Not prime");
        }
        System.out.println();

        //Question 8
        System.out.println("Question 8. Enter a number");
        x = Integer.parseInt(in.readLine());
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

        //Question 9
        System.out.println("Question 9. Enter a number");
        x = Integer.parseInt(in.readLine());
        long fac = 1;
        for (int i = 2; i <= x; i++) {
            fac *= i;
        }
        System.out.println(fac + "\n");

        //Question 10
        System.out.println("Question 10.");
        for (int i = 500; i <= 1000; i++) {
            System.out.print(i);
            if(i % 60 == 0) System.out.print("Z");
            else if(i % 12 == 0) System.out.print("Y");
            else if(i % 5 == 0) System.out.print("X");

            System.out.print(" ");
        }
    }
}
