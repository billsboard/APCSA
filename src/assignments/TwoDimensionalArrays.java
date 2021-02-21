package assignments;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArrays {

    // This is constant stuff
    static Random rand = new Random(111111111);
    final static int inf = 1 << 30;

    // This stuff is for printing the spirals.
    static int A, B, x = 4, y = 4, w = 0, cw = 0, cnt = 1;
    static int[][] dirs = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
    static int dir = 0;
    static int[][] map = new int[10][10];

    static boolean isMagicSquare(int arr[][]){
        int s = arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3];
        for (int i[] : arr) {
            int s2 = 0;
            for (int x : i) {
                s2 += x;
            }
            if(s2 != s) return false;
        }

        for (int i = 0; i < 4; i++) {
            int s2 = 0;
            for (int x[] : arr) {
                s2 += x[i];
            }
            if(s2 != s) return false;
        }


        return s == arr[0][3] + arr[1][2] + arr[2][1] + arr[3][0];
    }

    // Pythag
    static double dist(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {

        int arr[][] = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 5, 14, 1}
        };
        System.out.println("Question 1");
        System.out.println(isMagicSquare(arr) ? "Magic" : "Not magic");
        System.out.println();

        System.out.println("Question 2");
        char key[] = randCharArr(10);
        char arr2[][] = new char[8][];
        for (int i = 0; i < 8; i++) {
            arr2[i] = randCharArr(10);
        }
        System.out.println("Key: " + Arrays.toString(key));
        System.out.println("Ans:");
        prettyPrint(arr2);

        for (int i = 0; i < 8; i++) {
            int c = 0;
            for (int j = 0; j < arr2[i].length; j++) {
                if(arr2[i][j] == key[j]) c++;
            }
            System.out.println("Student " + (i + 1) + " got " + c + " correct");
        }
        System.out.println();


        System.out.println("Question 3. Code supports spirals up to 100 numbers");
        System.out.println("Generate a spiral from B to A, with B on the outside, B > A");
        B = 50; A = 9;
        System.out.println("B = " + B + ", A = " + A);
        for (int i = B; i >= A; i--) {
            map[x][y] = i;
            cw++;
            if(cw >= w){
                dir = dir + 1 > 3 ? 0 : dir + 1;
                cw = 0;
                cnt++;
                if(cnt == 2){
                    cnt = 0;
                    //cw = 1;
                    w++;
                }
            }
            x += dirs[dir][0];
            y += dirs[dir][1];
        }

        StringBuilder sb = new StringBuilder();
        int pad = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int tmp = 0;
            boolean wrt = false;
            for (int j = 0; j < 10; j++) {
                if(map[i][j] == 0) {
                    if(!wrt)
                        tmp++;
                    sb.append("    ");
                }
                else {
                    sb.append(String.format("%3d ", map[i][j]));
                    wrt = true;
                }
            }
            pad = Math.min(pad, tmp);
            sb.append("\n");
        }

        String s = sb.toString();
        s = s.replaceAll("(?m)^ +\\n", "");
        String rgx = "(?m)^ {" + ((pad * 4) + (3 - String.valueOf(B).length())) + "}";
        s = s.replaceAll(rgx, "");
        s = s.replaceAll("(?m) +\\n", "\n");
        System.out.println(s.trim());
        System.out.println("This question appeared on CCC 2001, Senior 2");
        System.out.println();



        System.out.println("Question 4");
        double pts[][] = new double[10][2];
        for (int i = 0; i < pts.length; i++) {
            pts[i][0] = rand.nextInt(100) - 50;
            pts[i][1] = rand.nextInt(100) - 50;
        }
        System.out.println("Points are:");
        prettyPrint(pts);

        double mn = Double.MAX_VALUE; int p1 = 0, p2 = 0;
        for (int i = 0; i < pts.length; i++) {
            for (int j = i + 1; j < pts.length; j++) {
                double d = dist(pts[i][0], pts[i][1], pts[j][0], pts[j][1]);
                if(d < mn){
                    p1 = i;
                    p2 = j;
                    mn = d;
                }
            }
        }
        System.out.printf("Closest points are (%f, %f) and (%f, %f) with distance %f\n\n", pts[p1][0], pts[p1][1], pts[p2][0], pts[p2][1], mn);

        System.out.println("Question 5");
        int arr3[][] = new int[4][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = randIntArr(5);
        }
        System.out.println("Array is:");
        prettyPrint(arr3);

        int res[][] = new int[arr3[0].length][arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                res[j][i] = arr3[i][j];
            }
        }
        System.out.println("Resultant:");
        prettyPrint(res);
        System.out.println();

        System.out.println("Question 6");
        int arr4[][] = {
                {10, 12, 7, 3, 12},
                {3, 10, 6, 2, 8},
                {18, 24, 17, 6, 10},
                {15, 21, 10, 8, 12},
                {1, 18, 22, 4, 15}
        };
        prettyPrint(arr4);

        int mxC[] = new int[arr4[0].length], mnC[] = new int[arr4[0].length];
        int mxR[] = new int[arr4.length], mnR[] = new int[arr4.length];

        Arrays.fill(mxC, -inf);
        Arrays.fill(mxR, -inf);
        Arrays.fill(mnC, inf);
        Arrays.fill(mnR, inf);

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                mxR[i] = Math.max(mxR[i], arr4[i][j]);
                mxC[j] = Math.max(mxC[j], arr4[i][j]);
                mnR[i] = Math.min(mnR[i], arr4[i][j]);
                mnC[j] = Math.min(mnC[j], arr4[i][j]);
            }
        }

        System.out.println("Max row, min col: ");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if(arr4[i][j] == mxR[i] && arr4[i][j] == mnC[j]){
                    System.out.println(arr4[i][j] + " at (" + i + ", " + j + ")");
                }
            }
        }
        System.out.println("Min row, max col: ");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if(arr4[i][j] == mnR[i] && arr4[i][j] == mxC[j]){
                    System.out.println(arr4[i][j] + " at (" + i + ", " + j + ")");
                }
            }
        }
        System.out.println();

        System.out.println("Question 7");
        int[][] arr5 = new int[5][];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = randIntArr(5);
        }
        prettyPrint(arr5);

        System.out.println("Result:");
        for (int i = 0; i < arr5.length + arr5[0].length - 1; i++) {
            int r = i, c = 0;
            while (r >= 0){
                if(r < arr5.length && c < arr5[0].length) System.out.print(arr5[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }


    }


    // Generate a random char array, with vals from A - E
    static char[] randCharArr(int l){
        char[] out = new char[l];
        for (int i = 0; i < l; i++) {
            out[i] = (char) (rand.nextInt(5) + 'A');
        }
        return out;
    }

    static int[] randIntArr(int l){
        int[] out = new int[l];
        for (int i = 0; i < l; i++) {
            out[i] = rand.nextInt(100);
        }
        return out;
    }

    // Print for assignment purposes
    static void prettyPrint(char[][] arr){
        for (char[] x : arr) {
            System.out.println(Arrays.toString(x));
        }
    }

    static void prettyPrint(double[][] arr){
        for (double[] x : arr) {
            System.out.println(Arrays.toString(x));
        }
    }

    static void prettyPrint(int[][] arr){
        for (int[] x : arr) {
            System.out.println(Arrays.toString(x));
        }
    }
}
