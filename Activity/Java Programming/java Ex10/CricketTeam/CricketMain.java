package CricketTeam;

import java.util.Scanner;

public class CricketMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the Team: ");
        String teamName = scanner.nextLine();
        Team team = new Team(teamName);
        
        while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. Display Players");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter the details of player in CSV format(Name,yyyy/mm/dd,Skill,No.OfMatches,Runs,Wickets,Nationality): ");
                String input = scanner.nextLine();
                String[] parts = input.split(",");
                Player player = new Player(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), parts[6], Double.parseDouble(parts[7]));
                team.addPlayer(player);
            } else if (choice == 2) {
                System.out.print("Enter the name of the player to be deleted: ");
                String name = scanner.nextLine();
                team.deletePlayer(name);
            } else if (choice == 3) {
                team.displayPlayers();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, please try again");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the program!");
    }
}
