package feb_7;

public class ServerDowntime {
    public static void main(String[] args) {
        int[] status = {1, 0, 0, 1, 0, 0, 0, 1};

        int totalDowntime = 0;
        int maxDowntime = 0;
        int currentDowntime = 0;

        for (int s : status) {
            if (s == 0) {
                totalDowntime++;
                currentDowntime++;
                if (currentDowntime > maxDowntime) {
                    maxDowntime = currentDowntime;
                }
            } else {
                currentDowntime = 0;
            }
        }

        System.out.println("Total downtime hours: " + totalDowntime);
        System.out.println("Longest continuous downtime: " + maxDowntime);
    }
}
