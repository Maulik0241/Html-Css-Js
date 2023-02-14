import java.util.*;
import java.util.TreeSet;

public class Program1 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of player:");
				int n = sc.nextInt();
				Set<String> ts1 = new TreeSet<String>();
				for(int i =0 ; i<=n ; i++) {
					ts1.add(sc.nextLine());
				}
				
				System.out.println(ts1);
			}
}
