package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class GreedyPig {

    static final int WIN = 100;

    static int[] scores;
    static Random rand = new Random();
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many players will be playing this game?");

        scores = new int[N = Integer.parseInt(in.readLine())];

        int p = 0;

        loop:
        while (checkWin() == -1){
            System.out.println("Player " + (p + 1) + ", " + scores[p] + " points");
            int a = noSix(), b = noSix();
            int sum = a + b;
            System.out.println(String.format("Roll: %d %d. You have a round score of %d. Roll again?", a, b, sum));
            String s;
            while((s = in.readLine()).toLowerCase().startsWith("y")){
                a = roll(); b = roll();
                if(a == 6 && b == 6){
                    System.out.println("Double six! All points were discarded.");
                    sum = 0;
                    scores[p] = 0;
                    break;
                }
                else if(a == 6 || b == 6){
                    System.out.println("Single six! No points for this round...");
                    sum = 0;
                    break;
                }
                else{
                    sum += a + b;
                    System.out.println(String.format("Roll: %d %d. You have a round score of %d. Roll again?", a, b, sum));
                }

                if(scores[p] + sum >= WIN){
                    scores[p] += sum;
                    System.out.println("Points have been added, you now have " + scores[p] + " points");
                    break loop;
                }
            }

            scores[p] += sum;
            System.out.println("Points have been added, you now have " + scores[p] + " points");

            p = p + 1 >= N ? 0 : p + 1;
            System.out.println();
        }

        System.out.println(checkWin() + 1 + " won the game!");


    }

    static int roll(){
        return rand.nextInt(6) + 1;
    }

    static int noSix(){
        return rand.nextInt(5) + 1;
    }

    static int checkWin(){
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= WIN) return i;
        }
        return -1;
    }
}
