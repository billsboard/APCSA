import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForLoops2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Part one
        System.out.print("How many numbers would you like to average: ");
        StringTokenizer tk = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(tk.nextToken());
        int s = 0;
        for (int i = 0; i < x; i++) {
            s += Integer.parseInt(in.readLine());
        }
        System.out.println((double) s / x);
        System.out.println();


        System.out.println("Enter n:");
        int n = Integer.parseInt(in.readLine());
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }
        System.out.println(sum);
    }
}
