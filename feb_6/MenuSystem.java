 package feb_6;
 
import java.util.Scanner; 
 
public class MenuSystem { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        boolean running = true; 
 
        while (running) { 
            

    System.out.println(

        "1. Start Service\n" +

        "2. Stop Service\n" +

        "3. Restart Service\n" +

        "4. Exit"

    );



 
            int choice = sc.nextInt(); 
 
            switch (choice) { 
                case 1: System.out.println("Service Started"); break; 
                case 2: System.out.println("Service Stopped"); break; 
                case 3: System.out.println("Service Restarted"); break; 
                case 4: running = false; break; 
                default: System.out.println("Invalid Choice"); 
            } 
        } 
        sc.close(); 
    } 
} 