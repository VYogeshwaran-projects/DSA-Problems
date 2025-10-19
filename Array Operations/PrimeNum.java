import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int count=0;
int count1=0;
        //Read the number of elements
        int n = sc.nextInt();
        int[] numbers = new int[n];

        // Read n integers
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check and print prime numbers
        for (int i = 0; i < n; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
	count = count + 1 ;
            }
else if(!isPrime(numbers[i]))
{
count1=count1+1;
}
        }
System.out.println("\nThe Number of prime numbers="+count);
System.out.println("\nThe Number of non prime numbers="+count1);
    }

    // Helper method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
