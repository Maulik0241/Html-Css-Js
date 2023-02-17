package CricketTeam;

import java.util.ArrayList;

class Team {
    String name;
    ArrayList<Player> players = new ArrayList<>();
    
    public Team(String name) {
        this.name = name;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player successfully added");
    }
    
    public void deletePlayer(String name) {
        boolean found = false;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).name.equalsIgnoreCase(name)) {
                players.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Player successfully deleted");
        } else {
            System.out.println("Player not found in the team");
        }
    }
    
    public void displayPlayers() {
        if (players.size() == 0) {
            System.out.println("No players to show");
        } else {
            System.out.println("Players in: " + name);
            System.out.println("Name Date of birth Skill No of matches Runs Wickets Nationality Rating");
            for (Player player : players) {
                System.out.println(player.toString());
            }
        }
    }
}
