package assignments.casinoplayer;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        CasinoPlayer ben = new CasinoPlayer();
        CasinoPlayer aaron = new CasinoPlayer("Aaron");
        CasinoPlayer rose = new CasinoPlayer(10);
        CasinoPlayer renee = new CasinoPlayer("Renee", 11);

        System.out.println("Ben: " + ben.getBal());
        System.out.println(aaron.name + ": " + aaron.getBal());
        System.out.println("Rose: " + rose.getBal());
        System.out.println(renee.name + ": " + renee.getBal());

        rose.withdraw(5);
        System.out.println(rose.getBal()); // Rose can withdraw 5 from her account since she has 10
        rose.withdraw(-5); // Negative withdraws do not go through
        System.out.println(rose.getBal());

        ben.setBal(100);
        System.out.println(ben.getBal()); // Ben can have balance set

        aaron.deposit(20); // Aaron can deposit 20
        System.out.println(aaron.getBal());
        aaron.deposit(-1); // Negative deposits do not go through
        System.out.println(aaron.getBal());

        renee.withdraw(100); // Renee does not have 100, so this doesn't go through
        System.out.println(renee.getBal()); // Still 11

        System.out.println("Generating 20 random numbers from 1-100:");
        for (int i = 0; i < 20; i++) {
            System.out.print(CasinoPlayer.randNum(1, 100) + " ");
        }
        System.out.println(); // Formatting

        // New assignment
        GuessingPlayer bill = new GuessingPlayer();
        bill.deposit(500); // Give Bill some money
        bill.play();
        System.out.printf("Balance: %d\n", bill.getBal());
        bill.play();
        System.out.printf("Balance: %d\n", bill.getBal());
        bill.play();
        System.out.printf("Balance: %d\n", bill.getBal());
        // Play 3 times for RNG to align and our tests to be good. Display balance every time
        bill.deposit(1234567); // This class refuses to allow more than 1000 in an account
        System.out.println(bill.getBal()); // Only 1000

        RoulettePlayer kevinLi = new RoulettePlayer();
        kevinLi.deposit(500);
        kevinLi.play();
        System.out.printf("Balance: %d\n", kevinLi.getBal());
        kevinLi.play();
        System.out.printf("Balance: %d\n", kevinLi.getBal());
        kevinLi.play();
        System.out.printf("Balance: %d\n", kevinLi.getBal());
        // Play 3 times, for each betting method
    }
}
