package feb_7;
public class ApiResponseTime {
    public static void main(String[] args) {
        int[] responseTimes = {500, 1500, 2500, 1800, 3000};

        int sum = 0;

        System.out.println("Slow APIs:");
        for (int time : responseTimes) {
            if (time > 2000) {
                System.out.println(time + " ms");
            }
            sum += time;
        }

        double average = (double) sum / responseTimes.length;
        System.out.println("Average Response Time: " + average + " ms");
    }
}
