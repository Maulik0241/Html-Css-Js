package HashMapWickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> playerMap = new HashMap<String, ArrayList<String>>();

        while (true) {
            System.out.print("Enter the player name: ");
            String playerName = scanner.nextLine();

            System.out.print("Enter wickets - separated by \"|\" symbol: ");
            String[] wickets = scanner.nextLine().split("\\|");
            ArrayList<String> wicketList = new ArrayList<String>();
            for (String wicket : wickets) {
                wicketList.add(wicket.trim());
            }

            playerMap.put(playerName, wicketList);

            System.out.print("Do you want to add another player (yes/no): ");
            String addAnother = scanner.nextLine();
            if (addAnother.equalsIgnoreCase("no")) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the player name to search: ");
            String playerName = scanner.nextLine();

            if (!playerMap.containsKey(playerName)) {
                System.out.println("No player found with the name " + playerName);
            } else {
                ArrayList<String> wicketList = playerMap.get(playerName);
                System.out.println("Player Name : " + playerName);
                System.out.println("Wickets :");
                for (String wicket : wicketList) {
                    System.out.println(wicket);
                }
            }

            System.out.print("Do you want to search another player (yes/no): ");
            String searchAnother = scanner.nextLine();
            if (searchAnother.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
