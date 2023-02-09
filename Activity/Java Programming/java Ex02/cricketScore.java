import java.util.*;

public class cricketScore {
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
    int score = sc.nextInt();
    if(score<0){
        System.out.println("Invalid Score");
        return;
    }
    for(int i=1;i<a.length;i+=2){
        if(a[i]>score){
            System.out.println(a[i-1]);
        }
    }
    
}
}