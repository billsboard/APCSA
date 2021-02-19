package assignments;

import java.io.IOException;

public class Nim {

    static int arr[], N, sum, pl, amt;
    static boolean p1 = true;

    static int nextInt() throws IOException {
        int x = 0;
        int c;
        while ((c = System.in.read()) != ' ' && c != '\n'){
            x *= 10;
            x += c - '0';
        }
        return x;
    }

    static void takeInput() throws IOException {
        System.out.println("The piles are currently as such: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the pile number, with 1 being the first pile:");
        pl = nextInt();
        while (pl <= 0 || pl > N || arr[pl] == 0){
            System.out.println("That is not a valid pile. Please try again:");
            pl = nextInt();
        }

        System.out.println("Enter a positive integer, the amount that you would like to take from the pile:");
        amt = nextInt();
        while (amt <= 0 || amt > arr[pl]){
            System.out.println("You cannot take that amount. You must satisfy 0 < amount <= " + arr[pl]);
            amt = nextInt();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Nim! Enter the number of piles you would like:");
        N = nextInt();
        sum = (N + 1) * N / 2;
        arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        while (true){
            System.out.println(p1 ? "Player 1 Turn" : "Player 2 Turn");
            takeInput();

            arr[pl] -= amt;
            sum -= amt;

            if(sum <= 0){
                System.out.printf("Player %d has taken the last token! Player %d wins!", p1 ? 1 : 2, p1 ? 2 : 1);
                break;
            }

            p1 = !p1;
        }
    }
}
