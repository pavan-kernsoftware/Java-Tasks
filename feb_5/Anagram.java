package feb_5;

import java.util.Arrays;
import java.util.Scanner;
 
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        char[] s1 = sc.nextLine().toLowerCase().toCharArray();
        System.out.print("Enter second string: ");
        char[] s2 = sc.nextLine().toLowerCase().toCharArray();
 
        Arrays.sort(s1);
        Arrays.sort(s2);
 
        if (Arrays.equals(s1, s2)) {
            System.out.println("They are Anagrams.");
        } else {
            System.out.println("Not Anagrams.");
        }
    }
}
