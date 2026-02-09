package feb_6;
import java.util.Scanner;

public class userlogin {
    private static int loginCount = 0;
    public static void login(String username) {
        loginCount++;
        System.out.println("User " + username + " logged in successfully.");
        System.out.println("Total users logged in: " + loginCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("=== Simple Login Tracker ===");
        do {
            System.out.print("Enter username to login: ");
            String username = scanner.nextLine();
            login(username);
            System.out.print("Do you want to login another user? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Final total users logged in: " + loginCount);
        scanner.close();
    }
}
