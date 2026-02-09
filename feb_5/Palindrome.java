package feb_5;

import java.util.Scanner;
 
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        String reverse = new StringBuilder(original).reverse().toString();
 
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}