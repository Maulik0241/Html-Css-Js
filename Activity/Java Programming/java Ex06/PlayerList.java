import java.util.*;
import java.util.ArrayList;

public class PlayerList {
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Enter the player details");
	    System.out.println("Enter player name");
	    String n = scanner.nextLine();
	    
	    System.out.println("Enter age");
	    int a= scanner.nextInt();
	    scanner.nextLine();
	    
	    System.out.println("Enter Country");
	    String c = scanner.nextLine();
	    
	    System.out.println(n);
	    System.out.println(a);
	    System.out.println(c);
	    
	    System.out.println("Enter Skill");
	    String s = scanner.nextLine();
	   
	    System.out.println("Enter the position to add the skill");
	    int p = scanner.nextInt();
	    scanner.nextLine();
	    
	    
	    ArrayList<String> pl1 = new ArrayList<String>();
	    pl1.add(n);
	    pl1.add(Integer.toString(a));
	    pl1.add(c);
	    pl1.add(p, s);
	   
	    for (String i : pl1) {
	        System.out.println(i);
	    }
	    System.out.println("Enter the position of the detail to be removed");
	    int rmp = scanner.nextInt();
	    pl1.remove(rmp);
	    

	    for (String i : pl1) {
	        System.out.println(i);
	    }
	    
	    scanner.close();
	}

}