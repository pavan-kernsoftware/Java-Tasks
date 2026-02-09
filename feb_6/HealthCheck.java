package feb_6;
public class HealthCheck { 
public static void main(String[] args) { 
double cpuUsage = 75.0; 
double memoryUsage = 85.0; 
String status = (cpuUsage < 80 && memoryUsage < 80) ? "HEALTHY" : "CRITICAL"; 
System.out.println("CPU Usage: " + cpuUsage + "%"); 
System.out.println("Memory Usage: " + memoryUsage + "%"); 
System.out.println("System Status: " + status); 
} 
}