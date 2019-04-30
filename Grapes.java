import java.util.Scanner;
public class Grapes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(),
        n = s.nextInt();
        int[] ok = new int[m];
        int[] okay = new int[n];
        for (int i = 0; i < m; ++i) ok[i] = s.nextInt();
        for (int i = 0; i < n; ++i) {okay[i] = s.nextInt();}
        int first[] = {goEVEN(ok, m), goODD(ok, m)};
        int second[] = {goEVEN(okay, n), goODD(okay, n)};
        // System.out.println(goEVEN(ok, m) + " " + goODD(ok, m) + " " + goEVEN(okay, n) + " " + goODD(okay, n));
        System.out.println(min(first[0], second[1]) + min(second[0], first[1]));
        // int max = 0;
        // for (int i = 0; i < m; ++i) {
        //     for (int j = 0; j < n; ++j) {
        //         if (i+j % 2 == 1) max = i+j;
        //     }
        // }
        // System.out.println(max);
    }
    public static Integer goEVEN(int[] arr, int sz) {
        int even = 0;
        // System.out.println(even);
        for (int i = 0; i < sz; ++i) {
            if (arr[i]%2 ==0) ++even;
        }
        return even;
    }
    public static Integer goODD(int[] arr, int sz) {
        int odd = 0;
        for (int i = 0; i < sz; ++i) {
            if (arr[i]%2 ==1) ++odd;
        }
        return odd;
    }
    public static Integer min(int x, int y) {
        return x > y ? y : x;
    }
}
/*5 4
9 14 6 2 11
8 4 7 20
*/