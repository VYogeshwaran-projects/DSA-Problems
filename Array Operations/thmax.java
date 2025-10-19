import java.io.*;
import java.util.*;

class maxi {
    static int max(int a[], int n) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;


        // find Greatest and second Greatest
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
	thirdmax = secmax;
                secmax = max;
                max = a[i];
            } else if (a[i] < max && a[i] > secmax) {
	thirdmax = secmax;
                secmax = a[i];
            }
else if (a[i] < max && secmax > thirdmax)
{
thirdmax = a[i];
}
        }

        return thirdmax;
    }

    public static void main(String s[]) {
        int a[] = new int[]{1, 2, 4, 6};
        int n = a.length;
        System.out.println("The Third Maximum Element = " + max(a, n));
    }
}
