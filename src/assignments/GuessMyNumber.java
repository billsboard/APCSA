package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Welcome to the Guess My Number game! Enter \"easy\" for easy mode, else just press enter. ");
        boolean e = reader.readLine().equalsIgnoreCase("easy");

        if(e) System.out.println("Easy mode selected...");

        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        int l = 10;
        int diff;

        System.out.println("Game started, a number from 1-100 has been chosen");

        while (l >= 0){
            if(l == 0){
                l--;
                continue;
            }

            try{
                System.out.print("Input a guess: ");
                int y = Integer.parseInt(reader.readLine());
                if(y < 1 || y > 100) {
                    System.out.println("Invalid guess! Range is 1-100 (inclusive).");
                    continue;
                }

                if(x == y){
                    l--;
                    break;
                }

                if(!e) {
                    if (x > y) System.out.println("Too low...");
                    else System.out.println("Too high...");
                }
                else{
                    diff = Math.abs(x - y);
                    System.out.println("The difference between the numbers was " + diff);
                }


                l--;
            }
            catch (NumberFormatException nfe){
                System.out.println("What the ki! That's not a number");
            }
        }

        if(l >= 0){
            System.out.println("Good job! It took you " + (10 - l) + " tries!");
        }
        else{
            System.out.println("You failed. The number was " + x);
        }


    }
}
