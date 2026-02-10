package feb_9;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 60000);
        Manager mgr = new Manager("Bob", 80000);
        System.out.println("Developer Details:");
        dev.displayDetails();
        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}
