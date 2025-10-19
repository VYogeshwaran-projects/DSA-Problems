import java.util.Scanner;

class inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the value to print
        System.out.print("Enter the value to print: ");
        int choice = sc.nextInt();

        // Read how many times to print it
        System.out.print("Enter how many times to print: ");
        int n = sc.nextInt();

        // Loop and print
        for (int i = 0; i < n; i++) {
            System.out.println(choice);
        }

        sc.close(); // Good practice to close the scanner
    }
}
