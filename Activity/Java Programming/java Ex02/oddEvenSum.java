import java.util.*;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size");
            return;
        }
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"Element");
            a[i] = sc.nextInt();
            if(a[i]<0){
                System.out.println("Invalid Input");
                return;
            }
        }
        
        int oddSum=0;
        int evenSum=0;
        for(int i:a){
            if(i%2==0){
                evenSum +=i;
            }
            
            if(i%2!=0){
                oddSum +=i;
            }
        }
            if(evenSum>=oddSum){
                System.out.println("Sum of even number:"+ evenSum);

            }else{
                System.out.println("Sum of odds number:" +oddSum);
            }
            
        }
        
    }