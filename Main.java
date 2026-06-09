public class Main {

    public static String convertToBinary(int decimalNum) {
        if (decimalNum == 0) {
            return "0";
        }

        String binaryResult = "";

        while (decimalNum > 0) {
            int remainder = decimalNum % 2;
            binaryResult = remainder + binaryResult;
            decimalNum = decimalNum / 2;
        }

        return binaryResult;
    }

    public static void main(String[] args) {
        int numberToConvert = 13;
        
        String binaryString = convertToBinary(numberToConvert);
        
        System.out.println("Decimal: " + numberToConvert);
        System.out.println("Binary:  " + binaryString);
    }
}