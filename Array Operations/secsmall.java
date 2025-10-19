import java.io.*;
import java.util.*;

class sec {
    static int secsmallest(int a[], int n) {
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;


        // find smallest and second smallest
        for (int i = 0; i < n; i++) {
            if (a[i] < small) {
                secsmall = small;
                small = a[i];
            } else if (a[i] > small && a[i] < secsmall) {
                secsmall = a[i];
            }
        }

        return secsmall;
    }

    public static void main(String s[]) {
        int a[] = new int[]{1, 2, 4, 6};
        int n = a.length;
        System.out.println("The Second Smallest Element = " + secsmallest(a, n));
    }
}
