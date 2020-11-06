package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Question 1
        System.out.println("Question 1.");
        String s = "abcde";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = s.length() - 1; j >=  0; j--) {
                sb.append(s.charAt(j)); // I use StringBuilder because it is bad practice to do += in loop for String;
            }
        }
        System.out.println(sb + "\n");

        // Question 2
        System.out.println("Question 2.");
        String s1 = "computer";
        int x = 0;
        for (char c : s1.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') x++;
        }
        System.out.println(x + " vowels present.\n");


        // Question 3
        System.out.println("Question 3.");
        String s2 = "computer", s3 = "science";
        if(s2.length() < s3.length()){
            String tmp = s2;
            s2 = s3; s3 = tmp;
        }
        StringBuilder sb2 = new StringBuilder();
        char c = '\u0000', c1 = '\u0000';
        if(s3.length() / 2 * 2 != s3.length()){
            c1 = s3.charAt(s3.length() - 1);
            s3 = s3.substring(0, s3.length() - 1);
        }
        else if(s2.length() / 2 * 2 != s2.length()){
            c = s2.charAt(s2.length() - 1);
            s2 = s2.substring(0, s2.length() - 1);
        }

        int i;
        for (i = 2; i <= s2.length(); i += 2){
            if(i > s3.length()){
                sb2.append(s2.substring(i - 2, i)).append(c1 == '\u0000' ? "" : c1).append(i == s2.length() ? "" : s2.substring(i)).append(c == '\u0000' ? "" : c);
                break;
            }
            else{
                sb2.append(s2.substring(i - 2, i)).append(s3.substring(i - 2, i));
            }
        }
        System.out.println(sb2 + "\n");

        // Question 4
        System.out.println("Question 4. Enter two letters:");
        String s4 = "computer", s5 = in.readLine().substring(0, 1), s6 = in.readLine().substring(0, 1);
        System.out.println(!s4.contains(s5) ? "Does not appear\n" : s4.replace(s5, s6) + "\n");

        // Question 5
        System.out.println("Question 5");
        System.out.println("Test case 1: aaacomputeraaaaa");
        String s7 = "aaacomputeraaaaa";
        System.out.println("Before " + s7.indexOf("computer") + ", after " + (s7.length() - (s7.indexOf("computer") + "computer".length())));

        String s8 = "computeraa";
        System.out.println("\nTest case 2: computeraa");
        System.out.println("Before " + s8.indexOf("computer") + ", after " + (s8.length() - (s8.indexOf("computer") + "computer".length())));



    }
}
