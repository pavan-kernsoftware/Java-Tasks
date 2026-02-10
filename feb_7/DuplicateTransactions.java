package feb_7;

public class DuplicateTransactions {
    public static void main(String[] args) {
        int[] transactions = {1001, 1002, 1003, 1002, 1004, 1001};

        System.out.println("Duplicate Transaction IDs:");
        for (int i = 0; i < transactions.length; i++) {
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (transactions[i] == transactions[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;

            for (int j = i + 1; j < transactions.length; j++) {
                if (transactions[i] == transactions[j]) {
                    System.out.println(transactions[i]);
                    break;
                }
            }
        }
    }
}
