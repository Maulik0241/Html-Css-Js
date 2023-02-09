import java.util.*;

public class customerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cust = sc.nextLine();
        String arrsplit[] = cust.split(",");
        String nm = arrsplit[0];
        String ad = arrsplit[1];
        String m = arrsplit[2];
        System.out.println("Enter the details: "+ nm +","+ ad+ ","+m);
        
        Customer com = new Customer(nm, ad, m);
        System.out.println("Name:" + com.getName());
        System.out.println("Address:"+ com.getAddress());
        System.out.println("Mobile:"+ com.getMobile());
    }
}
