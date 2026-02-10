package feb_7;
public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {85, 45, 67, -5, 60, 30};

        int pass = 0;
        int fail = 0;

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark found: " + mark);
            } else if (mark >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Pass count: " + pass);
        System.out.println("Fail count: " + fail);
    }
}
