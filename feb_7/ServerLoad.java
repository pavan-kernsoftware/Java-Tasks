package feb_7;

public class ServerLoad {
    public static void main(String[] args) {
        int[] cpuLoad = {45, 60, 30, 90, 70, 50, 80};

        int max = cpuLoad[0];
        int min = cpuLoad[0];
        int sum = 0;

        for (int load : cpuLoad) {
            if (load > max) max = load;
            if (load < min) min = load;
            sum += load;
        }

        double average = (double) sum / cpuLoad.length;

        System.out.println("Highest Load: " + max);
        System.out.println("Lowest Load: " + min);
        System.out.println("Average Load: " + average);
    }
}
