package assignments;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrayLists2 {
    static Random rand = new Random();

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Aaron"); arr.add("Ben"); arr.add("Rose"); arr.add("Renee"); arr.add("Cole");
        arr.add("Bruce"); arr.add("Jaden"); arr.add("Lu"); arr.add("Kiwan"); arr.add("Benjamin");

        System.out.println("Question 1: " + arr);
        System.out.println("a)");
        int cnt = 0;
        for (String s : arr) {
            if(s == null) continue;
            if(4 <= s.length() && s.length() <= 7) cnt++;
        }
        System.out.println(cnt);
        System.out.println("b)");
        int maxL = -1;
        for (String s : arr) {
            maxL = Math.max(s.length(), maxL);
        }
        for (String s : arr) {
            if(s.length() == maxL){
                System.out.println(s);
                break;
            }
        }
        System.out.println("c)");
        int minL = Integer.MAX_VALUE;
        for (String s : arr) {
            minL = Math.min(minL, s.length());
        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() == minL){
                String tmp = arr.get(arr.size() - 1);
                arr.set(arr.size() - 1, arr.get(i));
                arr.set(i, tmp);
            }
        }
        System.out.println("Resultant array: " + arr);
        System.out.println("d)");
        String key = "B";
        ArrayList<String> res = new ArrayList<>();
        Iterator<String> it = arr.iterator();
        while (it.hasNext()){
            String s = it.next();
            if(s == null) continue;
            else if(s.startsWith(key)){
                res.add(s);
                it.remove();
            }
        }
        System.out.println("Array: " + arr + "\nResult: " + res);
        System.out.println();

        ArrayList<Integer> arr2 = genArray(20);
        System.out.println("Question 2: " + arr2);
        System.out.println("a)");
        int idx = 0;
        Iterator<Integer> it2 = arr2.iterator();
        while (it2.hasNext()){
            it2.next();
            idx++;
            idx %= 4;
            if(idx == 0){
                it2.remove();
            }
        }
        System.out.println("Resultant array: " + arr2);
        System.out.println("b)");
        for (int i = 1; i < arr2.size(); i+=2) {
            arr2.add(i, -1);
        }
        System.out.println("Resultant array: " + arr2);
        System.out.println("c)");
        ArrayList<Integer> arr3 = genArray(20);
        System.out.println("New array: " + arr3);
        Collections.reverse(arr3);;
        System.out.println("Reversed: " + arr3);
        System.out.println("Original array: " + arr2);
        Collections.reverse(arr2);
        System.out.println("Reversed: " + arr2);
        System.out.println("d)");
        ArrayList<Integer> tmp2 = new ArrayList<>(), tmp3 = new ArrayList<>(), arr4 = new ArrayList<>();
        arr4.addAll(arr2);
        System.out.println("Iterator forward: " + arr2);
        for (Integer i : arr2) {
            if(tmp2.contains(i))
                tmp3.add(i);
            tmp2.add(i);
        }
        for (int x : tmp3) {
            for (int i = 0; i < arr2.size(); i++) {
                if(arr2.get(i) == x){
                    arr2.remove(i);
                    i--;
                }
            }
        }
        System.out.println("Result: " + arr2);
        System.out.println("Iterator backward: " + arr4);
        for (int x : tmp3) {
            for (int i = arr4.size() - 1; i >= 0; i--) {
                if(arr4.get(i) == x){
                    arr4.remove(i);
                }
            }
        }
        System.out.println("Result: " + arr4);
        System.out.println("e)");
        ArrayList<Integer> arr5 = genArray(25), arr6 = genArray(20), res3 = new ArrayList<>();
        Collections.sort(arr5); Collections.sort(arr6);
        System.out.println("Array 1: " + arr5 + "\nArray 2: " + arr6);
        if(arr5.size() < arr6.size()){
            ArrayList<Integer> swp = arr6;
            arr6 = arr5;
            arr5 = swp;
        }
        for (int x : arr5) {
            if(arr6.contains(x) && !res3.contains(x)) res3.add(x);
        }
        System.out.println("Common: " + res3);
    }

    static ArrayList<Integer> genArray(int lim){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < lim; i++) {
            res.add(rand.nextInt(100));
        }
        return res;
    }

}
