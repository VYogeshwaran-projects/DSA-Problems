import java.util.*;
import java.io.*;

public class addbin {
    public static String addStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;
            int sum = x + y + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addStrings(a, b));  // Output: "12"
    }
}
