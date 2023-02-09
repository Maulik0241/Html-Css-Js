import java.util.*;

public class inningsMain {
    public static void main(String[] args) {
        String s1 = "First";
        String s2 = "Second";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name:");
        String tm = sc.nextLine();
        System.out.println("Enter Session:");
        String in = sc.nextLine();
        System.out.println("Enter Runs:");
        int runs = sc.nextInt();
        Innings ing = new Innings(tm, in, runs);

        System.out.println("Name:" + ing.getTeamname());
        System.out.println("Inningsname"+ ing.getInningsname());
        System.out.println("Runs:" + ing.getRuns());
        if(in.equals(s1)){
            System.out.println("Need " + (runs+1) + " to win");
        }else if(in.equals(s2)){
            System.out.println("Match Ended");
        }else{
            System.out.println("Please Enter Valid Session");
        }
}
}
