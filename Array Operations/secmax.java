import java.io.*;
import java.util.*;

class sec {
    static int secondhighest(int a[], int n) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;


        // find smallest and second smallest
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                secmax = max;
                max = a[i];
            } else if (a[i] < max && a[i] >= secmax) {
                secmax = a[i];
            }
        }

        return secmax;
    }

    public static void main(String s[]) {
        int a[] = new int[]{1, 2, 4, 6};
        int n = a.length;
        System.out.println("The Second Highest Element = " + secondhighest(a, n));
    }
}
