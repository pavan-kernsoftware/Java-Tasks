package feb_6;
class UserSession { 
static int totalLogins = 0; 
int sessionId; 
UserSession(int id) { 
this.sessionId = id; 
totalLogins++; 
System.out.println("User " + sessionId + " logged in. Total logins: " + 
totalLogins); 
} 
} 
public class LoginTracker { 
public static void main(String[] args) { 
new UserSession(101); 
new UserSession(102); 
new UserSession(103); 
} 
} 
