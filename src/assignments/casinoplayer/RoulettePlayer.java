package assignments.casinoplayer;

import java.io.IOException;

public class RoulettePlayer extends GuessingPlayer {
    /* Once again, there is a rng method in CasinoPlayer. We don't need to recreate one */

    @Override
    void play() throws IOException {
        System.out.println("Enter a bet: ");
        while (!betAmount(Integer.parseInt(CasinoPlayer.in.readLine()))){
            System.out.println("Bet invalid, try again: ");
        }
        System.out.println("Bet on number (1), range (2), or parity (3): ");
        int x = Integer.parseInt(in.readLine()), rng = CasinoPlayer.randNum(1, 39);
        switch (x){
            case 1:{
                System.out.println("Enter said number:");
                int y = Integer.parseInt(in.readLine());
                if(y == rng){
                    System.out.println("You win 20x your bet!");
                    deposit(20 * bet);
                }
                else {
                    System.out.println("You lose your bet!");
                    withdraw(bet);
                }
                break;
            }
            case 2:{
                System.out.println("Range of 13 numbers beginning at 1, 14 or 27");
                int y = Integer.parseInt(in.readLine());
                int z = y + 12;
                if(y <= rng && rng < z){
                    System.out.println("You win 3x your bet!");
                    deposit(2 * bet);
                }
                else {
                    System.out.println("You lose your bet!");
                    withdraw(bet);
                }
                break;
            }
            case 3:{
                System.out.println("Even (0) or Odd (1)?:");
                int y = Integer.parseInt(in.readLine());
                if((rng & 1) == y){
                    System.out.println("You win 1x your bet!");
                    deposit(bet);
                }
                else {
                    System.out.println("You lose your bet!");
                    withdraw(bet);
                }
                break;
            }
        }
    }

    static void printBetChances(){
        System.out.println("Single number: 1/39\nRange: (max - min + 1)/39\nParity: 1/2");
    }
}
