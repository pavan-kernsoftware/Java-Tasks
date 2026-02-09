package feb_6;
public class SimpleBatchProcessor {
    public static void main(String[] args) {
        int[] records = {5, -1, 12, 20, -1, 30, -999, 40};
        System.out.println("Batch job started...");
        for (int i = 0; i < records.length; i++) {
            int record = records[i];
            if (record == -1) {
                System.out.println("Skipping invalid record at index " + i);
                continue;
            }
            if (record == -999) {
                System.out.println("Critical error at index " + i + ". Stopping job.");
                break;
            }
            System.out.println("Processing record: " + record);
        }
        System.out.println("Batch job finished.");
    }
}
