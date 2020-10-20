package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class RockPaperScissors {

    static Random rand = new Random();

    static HashMap<String, Integer>  map = new HashMap<>(){
        {
            put("rock", 0);
            put("paper", 1);
            put("scissors", 2);
            put("s", 2);
            put("r", 0);
            put("p", 1);
            put("1", 0);
            put("2", 1);
            put("3", 2);
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int w = 0, g = 0;

        while (true) {
            System.out.println("Round " + ++g +  ", enter your play:");
            String ps;
            Integer i = map.get(ps = in.readLine().toLowerCase());
            if(i == null){
                --g;
                System.out.println("Invalid choice. Choices are rock, paper or scissors");
                continue;
            }

            int c = rand.nextInt(3);
            String cs = "";
            switch (c){
                case 0:
                    cs = "rock"; break;
                case 1:
                    cs = "paper"; break;
                case 2:
                    cs = "scissors"; break;
            }
            switch (i){
                case 0:
                    ps = "rock"; break;
                case 1:
                    ps = "paper"; break;
                case 2:
                    ps = "scissors"; break;
            }

            if(c == i){
                System.out.println("Both players chose " + cs + ", game is drawn");
            }
            else if(i - c == 1 || i - c == -2){
                System.out.println("You chose " + ps + ", computer chose " + cs + ". You win!");
                w++;
            }
            else{
                System.out.println("You chose " + ps + ", computer chose " + cs + ". You lose...");
            }

            System.out.println("Play again? [Y/n]");
            if(in.readLine().equalsIgnoreCase("n")) break;
        }

        System.out.println(String.format("Game concluded. Win rate was %.2f percent", (double) w/g * 100.0));
    }

}
