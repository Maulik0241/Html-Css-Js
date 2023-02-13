import java.util.Scanner;

class TeamNameNotFoundException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TeamNameNotFoundException(String message) {
super(message);
       }
}
   public class Project4 {
    static String[] eligibleTeams = {"Chennai Super Kings", "Sun Risers", "Delhi Daredevils", 
    		"Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", 
    		"Rajasthan Royals", "Royal Challengers Bangalore"};

       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter the expected winner team of IPL Season 10: ");
              String runnerTeam = sc.nextLine();
              System.out.print("Enter the expected runner Team of IPL Season 10: ");
              String winnerTeam = sc.nextLine();
                try {
                	checkExistTeam(runnerTeam);
                	checkExistTeam(winnerTeam);
                     System.out.println("Expected IPL Season 10 winner: " + runnerTeam);
                     System.out.println("Expected IPL Season 10 runner: " + winnerTeam);
               } catch (TeamNameNotFoundException e) {
                     System.out.println("Error: " + e.getMessage());
              }
              }

        public static void checkExistTeam(String team) throws TeamNameNotFoundException {
             for (String eligibleTeam : eligibleTeams) {
                 if (eligibleTeam.equals(team)) {
                        return;
                    }
                }
        throw new TeamNameNotFoundException("The team name entered is not present in the eligible teams list for IPL season 10.");
       }
}

