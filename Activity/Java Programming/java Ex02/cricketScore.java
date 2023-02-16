import java.util.*;

public class cricketScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

       
        if (n < 0) {
            System.out.println("Invalid array size");
            return;
        }

        
        int[] scores = new int[n];

        // Read in the array elements
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            
            if (score < 0) {
                System.out.println("Invalid input");
                return;
            }
            scores[i] = score;
        }

        
        int givenScore = sc.nextInt();

        
        if (givenScore < 0) {
            System.out.println("Invalid score");
            return;
        }

        
        int[] highScorers = new int[n];
        int count = 0;

  
        for (int i = 0; i < n; i++) {
            if (scores[i] > givenScore) {
                highScorers[count] = i; 
                count++;
            }
        }


        int[] output = new int[count];
        for (int i = 0; i < count; i++) {
            output[i] = highScorers[i];
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
