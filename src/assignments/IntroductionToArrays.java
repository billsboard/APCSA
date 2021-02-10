package assignments;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class IntroductionToArrays {

    static Random rand = new Random();

    static int[] generate(){
        int[] out = new int[20];
        for (int i = 0; i < 20; i++) {
            out[i] = rand.nextInt(200);
        }
        return out;
    }

    static int nextInt() throws IOException {
        int x = 0;
        int c;
        while ((c = System.in.read()) != '\n' && c != ' ') {
            x *= 10;
            x += c - '0';
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = generate();
        System.out.println("Question 1, array is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println(sum);
        System.out.println();


        int arr1[] = generate();
        System.out.println("Question 2, array is: " + Arrays.toString(arr1));
        int sum1 = 0;
        for (int i : arr1) {
            sum1 += i;
        }
        System.out.println((double) sum1 / arr1.length);
        System.out.println();


        int arr2[] = generate();
        System.out.println("Question 3, array is: " + Arrays.toString(arr2));
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");


        int arr3[] = generate();
        System.out.println("Question 4, array is: " + Arrays.toString(arr3));
        for (int i : arr3) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        int tmp = arr3[0];
        arr3[0] = arr3[arr3.length - 1]; arr3[arr3.length - 1] = tmp;
        for (int i : arr3) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");


        int arr4[] = generate();
        System.out.println("Question 5, array is: " + Arrays.toString(arr4));
        int min = (1 << 30); // Infinity
        for (int i : arr4) {
            min =  Math.min(min, i);
        }
        System.out.println(min);
        System.out.println();

        int arr5[] = generate();
        System.out.println("Question 6, array is: " + Arrays.toString(arr5));
        for (int i = 1; i < arr5.length; i += 2)
            arr5[i] = -1 * Math.abs(arr5[i]);
        for (int i : arr5)
            System.out.print(i + " ");
        System.out.println();
        int sum5 = 0;
        for(int i : arr5)
            sum5 += i;
        System.out.println(sum5);
        System.out.println();

        int arr6[] = generate();
        System.out.println("Question 7, array is: " + Arrays.toString(arr6));
        int cnt = 0;
        for (int i : arr6)
            if((i & 1) == 1) cnt++;
        System.out.println(cnt);
        System.out.println();

        int arr7[] = generate();
        System.out.println("Question 8, array is " + Arrays.toString(arr7));
        int sum7 = 0;
        for (int i : arr7) {
            sum7 += i < 10 ? i * 2 : i;
        }
        System.out.println(sum7);
        System.out.println();

        int arr8[] = generate();
        System.out.println("Question 9, array is " + Arrays.toString(arr8));
        int key = 10, cnt1 = 0;
        for (int i : arr8) {
            if(i == key) cnt1++;
        }
        System.out.println(cnt1);
        System.out.println();

        int arr9[] = generate();
        System.out.println("Question 10, array is " + Arrays.toString(arr9));
        int sum8 = 0, sum9 = 0;
        for (int i = 0; i < 10; i++) {
            sum8 += arr9[i];
            sum9 += arr9[arr9.length - 1 - i];
        }
        System.out.println("Front: " + sum8 + ", back: " + sum9);
        System.out.println(sum8 > sum9 ? "Front is bigger" : "Back is bigger");
        System.out.println();

        int arr10[] = generate();
        System.out.println("Question 11, array is " + Arrays.toString(arr10) + ". Enter a number: ");
        int ui = nextInt();
        int cnt9 = 0, cnt10 = 0;
        for (int i = 0; i < 10; i++) {
            cnt9 += arr10[i] < ui ? 1 : 0;
            cnt10 += arr10[arr10.length - 1 - i] < ui ? 1 : 0;
        }
        System.out.println(cnt9 > cnt10 ? "Front has more" : "Front does not have more");
        System.out.println();

        int arr11[] = generate();
        System.out.println("Question 12, array is " + Arrays.toString(arr11));
        for (int i = 1; i < arr11.length; i++) {
            if(arr11[i] > arr11[i - 1])
                System.out.print("(" + i + ", " + arr11[i] + ") "); // (index, number)
        }
        System.out.println("\n");

        int arr12[] = generate();
        System.out.println("Question 13, array is " + Arrays.toString(arr12) + ". Enter a number: ");
        int ui2 = nextInt();
        for (int i = 0; i < arr12.length; i++) {
            for (int j = i + 1; j < arr12.length; j++) {
                if(arr12[i] + arr12[j] == ui2)
                    System.out.print("(" + arr12[i] + ", " + arr12[j] + ") ");
            }
        }
        System.out.println("\n");

        int arr13[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean[] valid = new boolean[21];
        System.out.println("Question 14, array is " + Arrays.toString(arr13));
        for (int i : arr13) {
            if(i <= 20 && i > 0) valid[i] = true;
        }
        for (int i = 1; i < 21; i++) {
            if(!valid[i]) {
                System.out.println(i + " is missing.\n");
                break;
            }
        }

        int arr14[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        System.out.println("Question 15, array is " + Arrays.toString(arr14));
        int neg[] = new int[10], pos[] = new int[10];
        int ni = 0, np = 0;
        for (int i : arr14) {
            if(i < 0) neg[ni++] = i;
            else pos[np++] = i;
        }

        for (int i = 0; i < 20; i++) {
            arr14[i] = (i & 1) == 0 ? pos[i / 2] : neg[(i - 1) / 2];
        }
        for(int i : arr14){
            System.out.print(i + " ");
        }
        System.out.print("\n\n");

        int arr15[] = {1, 2, 3, 4, 5, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int tmp1[] = new int[arr15.length];
        int idx = 0;
        System.out.println("Question 16, array is: " + Arrays.toString(arr15));
        loop:
        for (int i : arr15) {
            for (int j = 0; j < idx; j++) {
                if(tmp1[j] == i){
                    System.out.println(i + "\n");
                    break loop;
                }
            }
            tmp1[idx++] = i;
        }


        int arr16[] = {1, 2, 3, 4, 5, 1, 6, 7, 7, 9, 10, 11, 12, 10, 14, 15, 16, 17, 14, 19};
        System.out.println("Question 17, array is: " + Arrays.toString(arr16));
        int tmp2[] = new int[arr16.length], idx1 = 0;
        loop2:
        for (int i : arr16) {
            for (int j = 0; j < idx1; j++) {
                if(tmp2[j] == i){
                    continue loop2;
                }
            }
            tmp2[idx1++] = i;
        }
        arr16 = new int[idx1];
        for (int i = 0; i < idx1; i++) {
           arr16[i] = tmp2[i];
        }
        for (int i : arr16) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        int arr17[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};
        int tmp3[] = new int[arr17.length], idx2 = 0;
        System.out.println("Question 18, array is: " + Arrays.toString(arr17));
        loop3:
        for (int i : arr17) {
            for (int j = 0; j < idx2; j++) {
                if(tmp3[j] == i){
                    tmp3[j] = (1 << 30); // random value
                    continue loop3;
                }
            }
            tmp3[idx2++] = i;
        }
        for (int i = 0; i < idx2; i++) {
            if(tmp3[i] != (1 << 30)){
                System.out.println(tmp3[i]);
            }
        }

    }
}
