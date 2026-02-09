package feb_5;

import java.util.Scanner;
 
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
 
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        System.out.println("Number of vowels: " + count);
    }
}