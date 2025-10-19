import java.util.Scanner;

public class ParenthesisCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int balance = 0;  // to track the number of open brackets

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                if (balance == 0) {
                    // Found a closing ) without a matching (
                    System.out.println(1);
                    return;
                }
                balance--;  // match found
            }
        }

        // Final check: balance must be 0 if all are matched
        if (balance == 0) {
            System.out.println("Matching Brackets Found");
        } else {
            System.out.println("Matching Brackets Doesn't Found");
        }
    }
}
