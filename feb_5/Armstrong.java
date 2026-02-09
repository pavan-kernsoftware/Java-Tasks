package feb_5;

import java.util.Scanner;
 
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, result = 0, n = String.valueOf(num).length();
 
        while (original != 0) {
            int remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }
 
        System.out.println(num + (result == num ? " is an Armstrong number." : " is not."));
    }
}