import java.util.ArrayList;
import java.util.*;

public class CompareList {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> s14 = new ArrayList<String>();
        System.out.println("Enter the top 5 scorers of IPL Season 14:");
        s14.add(sc.nextLine());
        s14.add(sc.nextLine());
        s14.add(sc.nextLine());
        s14.add(sc.nextLine());
        s14.add(sc.nextLine());
        
        ArrayList<String> s15 = new ArrayList<String>();
        System.out.println("Enter the top 5 scorers of IPL Season 15:");
        s15.add(sc.nextLine());
        s15.add(sc.nextLine());
        s15.add(sc.nextLine());
        s15.add(sc.nextLine());
        s15.add(sc.nextLine());
        ArrayList<String> consistentPlayers = new ArrayList<String>(s14);
        consistentPlayers.retainAll(s15);

        System.out.println("Consistent players in both seasons: " + consistentPlayers);
    }
}
