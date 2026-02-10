package feb_7;

public class DataSyncValidation {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40};
        int[] destination = {10, 25, 30, 45};

        boolean identical = true;

        for (int i = 0; i < source.length; i++) {
            if (source[i] != destination[i]) {
                System.out.println("Mismatch at index " + i +
                        ": Source=" + source[i] +
                        ", Destination=" + destination[i]);
                identical = false;
            }
        }

        if (identical) {
            System.out.println("Both arrays are identical");
        }
    }
}
