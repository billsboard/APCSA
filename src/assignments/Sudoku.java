package assignments;

import java.util.Arrays;
import java.util.HashSet;

public class Sudoku {
    /*
    This is a trivial sudoku solver. It can only detect naked singles and therefore cannot solve many problems.
    A more advanced technique would be required
     */


    final static int ALL_POS = 0b1111111110;
    final static int[][] begin = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 5, 3, -1, -1, 7, -1, -1, -1, -1},
            {-1, 6, -1, -1, 1, 9, 5, -1, -1, -1},
            {-1, -1, 9, 8, -1, -1, -1, -1, 6, -1},
            {-1, 8, -1, -1, -1, 6, -1, -1, -1, 3},
            {-1, 4, -1, -1, 8, -1, 3, -1, -1, 1},
            {-1, 7, -1, -1, -1, 2, -1, -1, -1, 6},
            {-1, -1, 6, -1, -1, -1, -1, 2, 8, -1},
            {-1, -1, -1, -1, 4, 1, 9, -1, -1, 5},
            {-1, -1, -1, -1, -1, 8, -1, -1, 7, 9}
    };
    // Stolen from wikipedia sudoku page https://en.wikipedia.org/wiki/Sudoku.

    static int board[][] = new int[10][10], it = 0; // Board is a bitmask
    static HashSet<Integer> rows[] = new HashSet[10], cols[] = new HashSet[10], box[] = new HashSet[10];

    /*
    1 2 3
    4 5 6
    7 8 9
     */

    // Checks if all boxes only have one possibility
    static boolean done(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(Integer.bitCount(board[i][j]) != 1) return false;
            }
        }
        return true;
    }

    // Find lowest set bit
    static int lowB(int n)
    {
        for (int i = 0; i < 15; i++) {
            int x = 1 << i;
            if((n & x) != 0) return i;
        }
        return -1;
    }

    // Uses some conditionals to check for box.
    static int getBox(int row, int col){
        if(row <= 3){
            if(col <= 3) return 1;
            else if(col <= 6) return 4;
            else return 7;
        }
        else if(row <= 6){
            if(col <= 3) return 2;
            else if(col <= 6) return 5;
            else return 8;
        }
        else{
            if(col <= 3) return 3;
            else if(col <= 6) return 6;
            else return 9;
        }
    }
    
    public static void main(String[] args) {
        for (int[] a : board) {
            Arrays.fill(a, ALL_POS);
        }

        // Initialize all the sets.
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new HashSet<>();
        }

        for (int i = 0; i < cols.length; i++) {
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < box.length; i++) {
            box[i] = new HashSet<>();
        }

        // Set board
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(begin[i][j] != -1){
                    rows[i].add(begin[i][j]);
                    cols[j].add(begin[i][j]);
                    box[getBox(i, j)].add(begin[i][j]);
                    board[i][j] = 1 << begin[i][j];
                }
            }
        }

        loop:
        while (!done()){
            it++;

            // Remove redundant possibilities
            for(int i = 1; i <= 9; i++){
                for (int j = 1; j <= 9; j++) {
                    if(Integer.bitCount(board[i][j]) == 1){
                        rows[i].add(lowB(board[i][j]));
                        cols[j].add(lowB(board[i][j]));
                        box[getBox(i, j)].add(lowB(board[i][j]));
                    }
                }
            }

            // Trivial case, naked single.
            for(int i = 1; i <= 9; i++){
                for (int j = 1; j <= 9; j++) {
                    for (int k = 1; k <= 9; k++) {
                        if(Integer.bitCount(board[i][j]) <= 1) continue;
                        int sft = 1 << k;
                        int chk = board[i][j] & sft;
                        if(chk == 0) continue;

                        int pos = lowB(chk);
                        if(rows[i].contains(pos) || cols[j].contains(pos) | box[getBox(i, j)].contains(pos)){
                            board[i][j] ^= sft;
                            continue loop;
                        }
                    }
                }
            }

            // Rows. Checks for numbers with only one possibility
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if(rows[i].contains(j)) continue; // Don't check if we already set this one
                    int nmB = 1 << j;
                    int pos = 0, cnt = 0;
                    for (int k = 1; k <= 9; k++) {
                        if((board[i][k] & nmB) != 0){
                            cnt++;
                            pos = k;
                        }
                    }

                    if(cnt == 1){
                        board[i][pos] = nmB;
                        rows[i].add(j);
                        cols[pos].add(j);
                        box[getBox(i, pos)].add(j);
                        continue loop;
                    }
                }
            }

            // Cols. Checks for numbers with only one possibility
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if(cols[i].contains(j)) continue; // Don't check if we already set number in col
                    int nmB = 1 << j;
                    int pos = 0, cnt = 0;
                    for (int k = 1; k <= 9; k++) {
                        if((board[k][i] & nmB) != 0){
                            cnt++;
                            pos = k;
                        }
                    }

                    if(cnt == 1){
                        board[pos][i] = nmB;
                        rows[pos].add(j);
                        cols[i].add(j);
                        box[getBox(pos, i)].add(j);
                        continue loop;
                    }
                }
            }

            // Boxes. Checks for numbers with only one possibility
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if(box[i].contains(j)) continue; // Don't check if we already have in box
                    int nmB = 1 << j;
                    int posx = 0, posy = 0, cnt = 0;
                    for (int k = 1; k <= 9; k++) {
                        for (int l = 1; l <= 9; l++) {
                            if(getBox(k, l) != i) continue;
                            if((board[k][l] & nmB) != 0){
                                cnt++;
                                posx = k;
                                posy = l;
                            }
                        }
                    }

                    if(cnt == 1){
                        board[posx][posy] = nmB;
                        rows[posx].add(j);
                        cols[posy].add(j);
                        box[i].add(j);
                        continue loop;
                    }
                }
            }

            // If the loop made it here it means that the we did not perform operations. Therefore it is unsolvable with basic
            // detection. We should exit
            System.out.println("Not trivially solvable, requires advanced knowledge and techniques.");
            return;
        }

        // Print out and exit
        System.out.println("-------------------------");
        for(int i = 1; i <= 9; i++){
            System.out.print("| ");
            for (int j = 1; j <= 9; j++) {
                System.out.print(lowB(board[i][j]) + " ");
                if(j % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if(i % 3 == 0){
                System.out.println("-------------------------");

            }
        }

        System.out.println("Done in " + it + " iterations of the mainloop");

    }
}
