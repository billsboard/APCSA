import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class While {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = 1000;
        while (x > 500){
            System.out.print(x-- + " ");
        }

        System.out.println("\n");


        int num = 100;
        while (num <= 200){
            System.out.print(num + " ");
            num-=-2;
        }

        System.out.println("\n");


        System.out.print("Enter a number: ");
        double y = Double.parseDouble(reader.readLine());
        int z = 0;
        while (y > 1){
            System.out.print((y /= 2) + " ");
            z++;
        }
        System.out.println("\nLoop ran " + z + " times");
        System.out.println();


        double sum = 0;
        int count = 0;
        System.out.print("Enter any number of numbers, then enter -1: ");
        double a;
        while ((a = Double.parseDouble(reader.readLine())) != -1){
            count++;
            sum += a;
        }

        System.out.println("Average was: " + (sum/count));
        System.out.println();


        int b = 1234;
        int t = 0;
        int c;
        System.out.print("Enter password: ");
        while (t < 5 && (c = Integer.parseInt(reader.readLine()))!= b){
            System.out.print("Incorrect: ");
            t++;
        }

        if(t >= 5) System.out.println("Account locked");
        else System.out.println("Correct");



    }
}
