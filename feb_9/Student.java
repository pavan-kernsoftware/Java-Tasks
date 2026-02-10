package feb_9;

public class Student {

    private String name;
    private int marks;

    void setData(String n, int m) {
        name = n;
        marks = m;
    }

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else
            return 'C';
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.setData("Rahul", 85);

        System.out.println("Student: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + s.calculateGrade());
    }
}
