package feb_6;
public class access {
    public static void main(String[] args) {
        int age = 7;             
        boolean hasValidId = true; 
        boolean activeSubscription = true; 
        if (age >= 18 && hasValidId && activeSubscription) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
