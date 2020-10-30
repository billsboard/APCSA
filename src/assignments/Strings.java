package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Question 1
        System.out.println("Question 1.");
        System.out.println("Computer".length() + "\n");

        // Question 2
        System.out.println("Question 2.");
        System.out.println("hello".concat("world") + "\n");

        // Question 3
        System.out.println("Question 3.");
        System.out.println("hello".toUpperCase() + "\n");

        // Question 4
        System.out.println("Question 4.");
        String str1 = "Ki", str2 = "Aaron";
        System.out.println(str1.compareTo(str2) == 0 ? "Same string" : str1.compareTo(str2) < 0 ? str1 + " is before" : str2 + " is before");
        System.out.println();

        // Question 5
        System.out.println("Question 5.");
        System.out.println("HelloWorld".substring(0, 5) + "\n");

        // Question 6
        System.out.println("Question 6.");
        System.out.println("HelloWorld".substring(3, 7) + "\n");

        // Question 7
        System.out.println("Question 7.");
        System.out.println("HelloWorld".substring(5));
        System.out.println();

        // Question 8
        System.out.println("Question 8.");
        System.out.println("abcdefgh".indexOf("cde") == -1 ? "Does not contain" : "Does contain");
        System.out.println();

        // Question 9
        System.out.println("Question 9.");
        String str3 = "aaabbbaaacccaaa";
        int x = 0, y = 0;
        while (str3.indexOf("aaa", y) != -1){
            x++; y = str3.indexOf("aaa", y) + 3;
        }
        System.out.println("aaa appears " + x + " times\n");

        // Question 10
        System.out.println("Question 10. Enter a letter then a word");
        String str4 = in.readLine(), str5 = in.readLine();
        int a = 0, b = 0;
        while (str5.indexOf(str4, b) != -1){
            a++; b = str5.indexOf(str4, b) + str4.length();
        }
        System.out.println(str4 + " appears " + a + " times\n");

        // Question 11
        System.out.println("Question 11. Enter a string then a letter");
        int c = 0;
        String str6 = in.readLine(), str7 = in.readLine();
        for (int i = 0; i < str6.length() - str7.length(); i++) {
            String s = str6.substring(i, str7.length() + i);
            if(s.equals(str7)) {
                c++;
                str6 = str6.substring(0, i) + str6.substring(i + str7.length());
            }
        }
        System.out.println(c == 0 ? "Does not appear in string" : str6);

    }
}
