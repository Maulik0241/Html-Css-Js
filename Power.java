import java.util.*;

public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int val = sc.nextInt();
        if(val <0)

{

System.out.println("Number too small");

}
else if(val>32767){
    System.out.println("Number too large");
    
}
else{
    while(val%2==0){
        val =val/2;
    }
    if(val==1){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
sc.close();
    }
}