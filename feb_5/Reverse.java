package feb_5;

public class Reverse {
    
    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        int original = Math.abs(num); // Handle negative numbers
        
        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }
        
        // Return with original sign
        return num < 0 ? -reversed : reversed;
    }
    
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reverseNumber(number));
        
        int negativeNumber = -9876;
        System.out.println("\nOriginal number: " + negativeNumber);
        System.out.println("Reversed number: " + reverseNumber(negativeNumber));
    }
}
