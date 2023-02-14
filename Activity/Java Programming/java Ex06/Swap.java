import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("Gujarat Titans");
        teams.add("Rajasthan Royals");
        teams.add( "Royal Challengers Bangalore");
        teams.add("Lucknow Super Giants");
        teams.add("Delhi Capitals");
        for(String element:teams) {
        		System.out.println(element);
        }
        System.out.println("Enter swap positions");
        int pos1 = sc.nextInt();
        Collections.swap(teams, 0, pos1);
        System.out.println("Element in ArrayList After Swapping:");
        for(String element:teams) {
        	System.out.println(element);
        }
    }
}
