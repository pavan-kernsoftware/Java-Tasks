package feb_5;
import java.util.Arrays;
import java.util.Scanner;
 
public class Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
 
        Arrays.sort(arr); // Built-in efficient sorting
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}