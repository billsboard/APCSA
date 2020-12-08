package assignments.casinoplayer;

import java.io.IOException;

public class GuessingPlayer extends CasinoPlayer{
    /* We defined some functions in the last CasinoPlayer assignment. CasinoPlayer has a randNum method
    Therefore, a new one will not be created here
     */

    void play() throws IOException { // IOException a bit annoying. InputStream needs it
        System.out.println("Enter a bet: ");
        while (!betAmount(Integer.parseInt(CasinoPlayer.in.readLine()))){
            System.out.println("Bet invalid, try again: ");
        }
        System.out.println("Enter a number: ");
        int x = Integer.parseInt(CasinoPlayer.in.readLine()); // Input filtering was not required
        int y = CasinoPlayer.randNum(1, 10);
        if(x == y){
            System.out.println("You win 3x your bet!");
            deposit(bet * 3);
        }
        else if(Math.abs(x - y) == 1){
            System.out.println("You win 1x your bet!");
            deposit(bet);
        }
        else{
            System.out.println("You lose your bet!");
            withdraw(bet);
        }
        bet = 0; // Zero bet to prevent bugs
    }

    @Override
    void deposit(int x) {
        super.deposit(x);
        setBal(Math.min(getBal(), 1000)); // You can only have at most 1000 dollars as a limit for this game
    }
}
