package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Hangman {

    static char[] word, cur, guess = new char[1000];
    static String[] wGuess = new String[1000];
    static int lives = 5;
    static int round = 1;

    static int wP = 0, gP = 0;

    static Pattern wordMatcher = Pattern.compile("[^\\w\\s]");


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the hidden word for this game:");
        String line = in.readLine().toLowerCase();

        word = line.toCharArray();
        cur = new char[word.length];
        Arrays.fill(cur, '_');

        System.out.println("Word received!\nInitialization Completed!\n\nWelcome to Hangman!\nThe goal is to guess the letters in the word until you get it correct of run out of lives!\n" +
                "You start with " + lives + " lives\n\n(This text is definitely not here to hide the word chosen above)\n\nGame will start now:");

        String s;
        while (lives > 0){
            System.out.println("\n");
            System.out.println("Round " + round + ".\nYou have " + lives + " lives remaining...");

            System.out.println("Word progress:");
            for (char c : cur) {
                if(c == '\u0000') break;
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.println("\nYou have guessed the following letters:");

            for (char c : guess) {
                if(c == '\u0000') break;
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("\nYou have guessed the following complete words:");
            for (String w : wGuess){
                if(w == null) break;
                System.out.println(w.concat(" "));
            }
            System.out.println("\nPlease input your guess:");

            s = in.readLine().toLowerCase();
            while ((!s.matches("[a-zA-Z]")&& wordMatcher.matcher(s).find()) ||
                s.isEmpty() || (charContains(s.charAt(0)) && s.length() == 1) || Arrays.asList(wGuess).contains(s)){
                System.out.println("Invalid input, please try again:");
                s = in.readLine().toLowerCase();
            }

            int rep = 0;
            if(s.matches("[a-zA-Z]")){
                char c = s.charAt(0);
                for (int i = 0; i < word.length; ++i) {
                    if(c == word[i]){
                        ++rep;
                        cur[i] = c;
                    }
                }
                guess[gP++] = c;
            }
            else {
                if(s.equals(line)){
                    System.out.println("Good job! You completed the game!");
                    System.out.println("You finished on round " + round + " with " + lives + " lives remaining!");
                    return;
                }
                wGuess[wP++] = s;
            }

            if(rep != 0){
                System.out.println(s.charAt(0) + " was indeed a correct character! " + rep + " blanks have been replaced");

            }
            else{
                System.out.println("Guess was incorrect. You now have " + --lives + " lives remaining");
            }

            round++;

            if(!charContains('_')){
                System.out.println("Good job! You completed the game!");
                System.out.println("You finished on round " + round + " with " + lives + " lives remaining!");
                return;
            }
        }

        System.out.println("You failed miserably at this game. Go cry in a corner");
        System.out.println("The word was " + line);
    }

    static boolean charContains(char c){
        if(c == '_'){
            for (char x : cur) {
                if(x == c) return true;
            }
            return false;
        }
        for (char x : guess) {
            if(x == c) return true;
        }
        return false;
    }
}
