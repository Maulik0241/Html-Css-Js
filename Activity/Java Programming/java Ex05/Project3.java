import java.util.Scanner;

class InvalidAgeRange extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeRange(String message) {
        super(message);
    }
}

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String name = sc.nextLine();

        System.out.print("Enter player age: ");
        int age = sc.nextInt();

        try {
            if (age < 19) {
                throw new InvalidAgeRange("Age is below 19, player not eligible to participate in IPL");
            }
            System.out.println("Player name: " + name);
            System.out.println("Player age: " + age);
        } catch (InvalidAgeRange e) {
            System.out.println(e.getMessage());
        }
    }
}
