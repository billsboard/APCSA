package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SlotMachine {

    static int m = 100;
    static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = "yes";

        int a, b, c;
        while (!s.equalsIgnoreCase("no") && m > 0){ System.out.println("You have $" + m); System.out.print("Enter a bet: "); int x = Integer.parseInt(in.readLine());
            a = rand.nextInt(4) + 1; b = rand.nextInt(4) + 1; c = rand.nextInt(4) + 1;
            System.out.println(String.format("Very fair RNG produced: %d %d %d", a, b, c));
            if(a == b && b == c) System.out.println("You have won 10x your bet! Your current balance is " + (m += x * 10));
            else if(a == b || b == c || a == c) System.out.println("You have won 2x your bet! Your current balance is " + (m += x * 2));
            else System.out.println("You have lost your bet. Your current balance is " + (m -= x));

            if(m > 0){
                System.out.print("Play again?: ");
                s = in.readLine();
            }
        }
    }
}
