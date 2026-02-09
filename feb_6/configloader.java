package feb_6;
public class configloader { 
public static void main(String[] args) { 
int maxUsers = 120; 
double threshold = 100.0; 
boolean featureFlag = true; 
String environment = "Production"; 
System.out.println("Environment: " + environment); 
if (maxUsers > threshold) { 
System.out.println("Warning: Max users exceed threshold!"); 
} 
} 
}