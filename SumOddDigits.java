import java.util.*;

public class SumOddDigits {
    public static void main(String args[]){
        int sum=0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(num>32767 || num<0){
            System.out.println("Invalid Input");
        }
        else{
        while (num>0){
            r = num%10;
            if(r%2==1){
                sum = sum + r;
            }
            num = num/10;
        }
        System.out.println(sum);
    }
    sc.close();
    }
}