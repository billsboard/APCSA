package assignments;

import java.util.*;

public class IntroTo2DArrays {

    static Random rand = new Random(1111111);

    public static void main(String[] args) {
        System.out.println("Question 1");
        int arr[][] = gen2D(10, 10);
        System.out.println("Array is: " + prettyPrint(arr));
        int mn = 1 << 30;
        for (int a[] : arr) {
            for (int b : a) {
                mn = Math.min(b, mn);
            }
        }
        System.out.println(mn);

        System.out.println("\nQuestion 2");
        int arr2[][] = gen2D(10, 5);
        System.out.println("Array is: " + prettyPrint(arr2));
        System.out.println(arr2.length == arr2[0].length ? "Square" : "Rectangle");

        System.out.println("\nQuestion 3");
        int arr3[][] = gen2D(10, 5);
        System.out.println("Array is: " + prettyPrint(arr3));
        int col = 3, sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i][col];
        }
        System.out.println(sum);

        System.out.println("\nQuestion 4");
        int arr4[][] = gen2D(10, 5);
        System.out.println(prettyPrint(arr4));
        int mx = Integer.MIN_VALUE, row = -1;
        for (int i = 0; i < arr4.length; i++) {
            int s2 = 0;
            for (int b : arr4[i]) {
                s2 += b;
            }

            if(s2 > mx){
                mx = s2;
                row = i;
            }
        }
        System.out.println(row);

        System.out.println("\nQuestion 5"); // Take input not required;
        int a1 = 4, b1 = 3, arr5[][] = gen2D(10, 5);
        System.out.println(prettyPrint(arr5));
        int f1 = 0, f2 = 0;
        for (int[] a : arr5) {
            for(int b : a){
                if(b == a1)f1++;
                if(b == b1) f2++;
            }
        }
        System.out.println(f2 == f1 ? (a1 + " " + b1) : f1 > f2 ? a1 : b1);

        System.out.println("\nQuestion 6"); // Im not sure what this means, but I assume you search for all values and replace
        int s2 = 51; // Seeded random gen
        int[][] arr6 = gen2D(10, 5);
        System.out.println(prettyPrint(arr6));
        for (int i = 0; i < arr6.length; i++){
            for (int j = 0; j < arr6[0].length; j++) {
                if(arr6[i][j] == s2){
                    arr6[i][j] = arr6[(i + 1) % arr6.length][j];
                }
            }
        }
        System.out.println("Res:");
        System.out.println(prettyPrint(arr6));

        System.out.println("\nQuestion 7");
        int[][] arr7 = gen2D(5, 5);
        System.out.println(prettyPrint(arr7));
        int p = Integer.MIN_VALUE;
        boolean ok = true;
        loop:
        for (int a[] : arr7) {
            for (int b : a) {
                if(b < p){
                    ok = false;
                    break loop;
                }
                p = b;
            }
        }
        System.out.println(ok ? "Yes" : "No");

        System.out.println("\nQuestion 8");
        int arr8[][] = gen2D(5, 5);
        System.out.println(prettyPrint(arr8));
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                if((arr8[i][j] & 1) == 0){
                    arr8[i][j] = arr8[i][(j + 1) % arr8[i].length];
                }
            }
        }
        System.out.println("Res");
        System.out.println(prettyPrint(arr8));

        System.out.println("\nQuestion 9");
        Set<Integer> set = new HashSet<>();
        int arr9[][] = gen2D(5, 5);
        System.out.println(prettyPrint(arr9));
        for (int a[] : arr9) {
            for (int b : a) {
                set.add(b);
            }
        }
        System.out.println(set.size() == arr9.length * arr9[0].length ? "No duplicates" : "Duplicates");

        System.out.println("\nQuestion 10");
        String[][] arr10 = {{"Rose", "Coconut", "Ben"}, {"Aaron", "Renee", "Cole"}, {"Zed", "Ki", "Odysseus"}};
        int cnt = 0;
        for (int i = 0; i < arr10.length; i++) {
            for (int j = 0; j < arr10[i].length; j++) {
                if(arr10[i][j] == null) continue;
                if(arr10[i][j].length() <= 3){
                    cnt++;
                    arr10[i][j] = null;
                }
            }
        }
        System.out.println(cnt);

        System.out.println("\nQuestion 11");
        String[][] arr11 = new String[10][2];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter last names");
        String key = "Ki";
        for (int i = 0; i < 10; i++) {
            arr11[i][0] = in.nextLine();
        }
        System.out.println("Enter first names");
        for (int i = 0; i < 10; i++) {
            arr11[i][1] = in.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            if(arr11[i][0].equals(key)){
                System.out.println(arr11[i][0] + ", " + arr11[i][1]);
                return;
            }
        }

        System.out.println("Not found");

    }

    static int[][] gen2D(int r, int c){
        // Helper function to generate a 2D array
        int[][] out = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                out[i][j] = rand.nextInt(100);
            }
        }
        return out;
    }

    static String prettyPrint(int[][] arr){
        StringBuilder s = new StringBuilder();
        s.append("\n");
        for (int[] a : arr) {
            s.append("[");
            for (int b : a) {
                s.append(b).append(", ");
            }
            s.delete(s.length() - 2, s.length());
            s.append("]");
            s.append("\n");
        }

        return s.toString().trim();
    }
}
