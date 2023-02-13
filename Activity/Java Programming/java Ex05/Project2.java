import java.util.Scanner;

public class Project2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfOvers;
    int[] runsScored;
    System.out.print("Enter the number of overs: ");
    numberOfOvers = sc.nextInt();

    try {
      runsScored = new int[numberOfOvers];
      for (int i = 0; i < numberOfOvers; i++) {
        System.out.print("Enter the runs scored in over " + (i + 1) + ": ");
        runsScored[i] = sc.nextInt();
      }
      System.out.print("Enter the over number to display runs: ");
      int  overNum = sc.nextInt();
      System.out.println("Runs scored in over " + overNum + ": " + runsScored[ overNum - 1]);
    } catch (Exception e) {
      System.out.println("Exception thrown: " + e.getClass().getName());
    }
  }
}
