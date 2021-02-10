package assignments;

import java.io.IOException;
import java.util.Arrays;

public class ArraysAssignment {
    static final int inf = 1 << 30;

    static int readInt() throws IOException {
        int x = 0, c;
        while ((c = System.in.read()) != '\n' && c != ' '){
            x *= 10;
            x += c - '0';
        }
        return x;
    }

    static double percentEven(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        int cnt = 0;
        for (int i : arr) {
            if((i & 1) == 0) cnt++;
        }
        return 1.0 * cnt / arr.length * 100;
    }

    static int minGap(int[] arr){
        if(arr == null || arr.length < 2) return 0;
        int mG = inf;
        for (int i = 1; i < arr.length; i++) {
            mG = Math.min(mG, Math.abs(arr[i] - arr[i - 1]));
        }
        return mG;
    }

    static void swapElements(int[] a1, int[] a2){
        // Arrays are passed by reference, we can swap pointers
        for (int i = 0; i < a1.length; i++) {
            int tmp = a1[i];
            a1[i] = a2[i];
            a2[i] = tmp;
        }
    }

    static int[] stretch(int[] arr){
        int res[] = new int[arr.length * 2], idx = 0;
        for (int i : arr) {
            if((i & 1) == 0){
                res[idx++] = i / 2;
                res[idx] = res[idx - 1];
                idx++;
            }
            else{
                res[idx++] = i / 2 + 1;
                res[idx] = res[idx - 1] - 1;
                idx++;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        System.out.println("Question 1"); // This array isn't even, last element will not be used
        int arr[] = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5,19};
        int pS = -(1 << 30), i1 = -1, i2 = -1;
        for (int i = 1; i < arr.length; i += 2) {
            if(arr[i] + arr[i - 1] > pS){
                pS = arr[i] + arr[i - 1];
                i1 = i - 1;
                i2 = i;
            }
        }
        System.out.println("Sum: " + pS + " at i = " + i1 + ", " + i2);
        System.out.println();

        System.out.println("Question 2");
        int s = 0;
        int arr2[] = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5,19};
        for (int i = 0; i < arr2.length; i++) {
            s += arr2[i];
            if(s > 50){ // Strictly greater
                System.out.println("Hits " + s + " at element with index " + i);
                break;
            }
        }

        int x = 100; // Take input was not specified, will just use random var
        s = 0;
        for (int i = 0; i < arr2.length; i++) {
            s += arr2[i];
            if(s > x){ // Strictly greater
                System.out.println("Hits " + s + " at element with index " + i);
                break;
            }
        }
        System.out.println();

        System.out.println("Question 3");
        int arr3[] = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5,19}, cnt = 0;
        for (int i = 1; i < arr3.length - 1; i++) {
            if(Math.abs(arr[i] - arr[i - 1]) <= 5 && Math.abs(arr[i] - arr[i + 1]) <= 5){
                cnt++;
            }
        }
        System.out.println(cnt + "\n");

        System.out.println("Question 4");
        int arr4[] = {5,6,9,10,4,30,6,15,18,20,22,6,1,1,2,5,19}, // Assuming the numbers are within 1 < x < 100000
            freq[] = new int[100000], tmp[] = new int[arr4.length + 1], idx = 0, mx = -inf;
        for(int i : arr4){
            freq[i]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > mx){
                idx = 1;
                tmp[0] = i;
                mx = freq[i];
            }
            else if(freq[i] == mx){
                tmp[idx++] = i;
            }
        }

        System.out.println("Occurrences: " + mx + " ");
        for (int i = 0; i < idx; i++) {
            System.out.print(tmp[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Question 5");
        System.out.println("perecentEven of {6, 2, 9, 11, 3}: " + percentEven(new int[]{6, 2, 9, 11, 3}));
        System.out.println("perecentEven of {}: " + percentEven(new int[]{}));
        System.out.println();

        System.out.println("Question 6");
        System.out.println("minGap of " + Arrays.toString(arr4) + ": " + minGap(arr4));
        System.out.println();

        System.out.println("Question 7");
        int arr5[] = {11, 42, -5, 27, 0, 89}, arr6[] = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr5) + " and " + Arrays.toString(arr6));
        swapElements(arr5, arr6);
        System.out.println("Swapped res: " + Arrays.toString(arr5) + " and " + Arrays.toString(arr6));
        System.out.println();

        System.out.println("Question 8");
        System.out.println("Stretch {18, 7, 4, 24, 11}: " + Arrays.toString(stretch(new int[]{18, 7, 4, 24, 11})));

    }
}
