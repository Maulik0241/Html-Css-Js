package TreeMapPlayer;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, Player> players = new TreeMap<>();
	    System.out.println("Enter the number of players");
	    int numPlayers = sc.nextInt();
	    sc.nextLine(); 

	    for (int i = 1; i <= numPlayers; i++) {
	        System.out.println("Enter the details of the player " + i);
	        String capNumber = sc.nextLine();
	        String name = sc.nextLine();
	        String team = sc.nextLine();
	        String skill = sc.nextLine();

	        Player player = new Player(name, team, skill);
	        players.put(capNumber, player);
	    }

	    System.out.println("Player Details");
	    for (String capNumber : players.keySet()) {
	        Player player = players.get(capNumber);
	        System.out.println(capNumber + "--" + player.toString());
	    }
	}

}
