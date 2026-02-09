package feb_6;

public class ApiRetry {
    public static boolean callApi() {
        return Math.random() > 0.5; 
    }
    public static void main(String[] args) {
        int maxRetries = 3;
        int attempt = 0;
        boolean success = false;
        while (attempt < maxRetries) {
            attempt++;
            System.out.println("Attempt " + attempt + ": Calling API...");
            success = callApi();
            if (success) {
                System.out.println("API call succeeded!");
                break; 
            } else {
                System.out.println("API call failed.");
            }
        }
        if (!success) {
            System.out.println("All retries failed. Giving up.");
        }
    }
}
