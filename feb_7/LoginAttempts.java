package feb_7;

public class LoginAttempts {
    public static void main(String[] args) {
        int[] attempts = {1, 2, 4, 0, 5};

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 3) {
                System.out.println("Alert: User " + (i + 1) + " has exceeded login attempts");
            }
        }
    }
}
