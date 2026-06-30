public class function {

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int myNumber = 2005;
        
        int result = calculateSquare(myNumber);
        
        System.out.println("The square of " + myNumber + " is: " + result);
    }
}