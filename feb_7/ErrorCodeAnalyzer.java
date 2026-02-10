package feb_7;

public class ErrorCodeAnalyzer {
    public static void main(String[] args) {
        int[] errorCodes = {404, 500, 404, 403, 500, 404};

        int maxCount = 0;
        int frequentCode = errorCodes[0];

        for (int i = 0; i < errorCodes.length; i++) {
            int count = 0;
            for (int j = 0; j < errorCodes.length; j++) {
                if (errorCodes[i] == errorCodes[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                frequentCode = errorCodes[i];
            }
        }

        System.out.println("Most frequent error code: " + frequentCode);
        System.out.println("Occurrences: " + maxCount);
    }
}
