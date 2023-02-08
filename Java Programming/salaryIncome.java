import java.util.*;

public class salaryIncome {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int salary = sc.nextInt();
    int shift = sc.nextInt();
    if(salary>8000){
        System.out.println("Salary too large");
    }else if(shift<0){
        System.out.println("Shifts too small ");
    }
    else if(salary<0){
        System.out.println("Salary too small");
    }else{


    double extraIncome = salary*0.02*shift;
    double food = salary*0.2;
    double travel = salary*0.3;
    double saving = salary - food - travel+extraIncome;
    System.out.println("saving is ="+ saving);
        }
        sc.close();
        }
}

