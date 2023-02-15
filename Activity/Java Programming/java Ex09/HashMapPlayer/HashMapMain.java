package HashMapPlayer;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Player> playerMap = new HashMap<String, Player>();

        // Register all the player details
        while (true) {
            System.out.println("Enter the player name");
            String playerName = sc.nextLine();

            System.out.println("Enter wickets - separated by '|' symbol.");
            String wicketsStr = sc.nextLine();
            String[] wickets = wicketsStr.split("\\|");

            Player player = new Player(playerName, wickets.length);

            playerMap.put(playerName, player);

            System.out.println("Do you want to add another player (yes/no)");
            String addAnother = sc.nextLine();

            if (!addAnother.equalsIgnoreCase("yes")) {
                break;
            }
        }

        while (true) {
            System.out.println("Enter the player name to search");
            String searchName = sc.nextLine();

            if (!playerMap.containsKey(searchName)) {
                System.out.println("No player found with the name " + searchName);
            } else {
                Player player = playerMap.get(searchName);
                System.out.println("Player name: " + player.getBowlerName());
                System.out.println("Wicket count: " + player.getWicketCount());
            }

            System.out.println("Do you want to search another player (yes/no)");
            String searchAnother = sc.nextLine();

            if (!searchAnother.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
