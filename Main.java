public class Main {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        // Check for factors from 2 up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; // No factors found, it is prime
    }

    // Method from your image to print all primes in the range [2, n]
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // if true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String args[]) {
        primesInRange(20); // Prints primes from 2 to 20
    }
}