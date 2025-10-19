import java.io.*;
import java.util.*;

class li {
    static class Solution {
        public void merge(int[] a, int m, int[] a1, int n) {
            int p1 = m - 1;
            int p2 = n - 1;
            int p = m + n - 1;

            while (p1 >= 0 && p2 >= 0) {
                if (a[p1] > a1[p2]) {
                    a[p] = a[p1];
                    p1--;
                } else {
                    a[p] = a1[p2];
                    p2--;
                }
                p--;
            }

            while (p2 >= 0) {
                a[p] = a1[p2];
                p2--;
                p--;
            }
        }
    }

    public static void main(String s[]) {
        int a[] = {1, 2, 3, 0, 0, 0};
        int a1[] = {2, 5, 6};
        int m = 3, n = 3;

        Solution sol = new Solution(); // ✅ now valid
        sol.merge(a, m, a1, n);

        for (int num : a) {
            System.out.print(num);
        }
    }
}
