public class function {
    public static boolean isPalindrome(int number) {
        if (number < 0) return false;
        int original = number;
        int reversed = 0;
        for (; number > 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int num = 132321;
        System.out.println(num + (isPalindrome(num) ? " is a palindrome." : " is not a palindrome."));
    }
}