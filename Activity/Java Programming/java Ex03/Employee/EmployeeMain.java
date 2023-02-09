import java.util.*;

public class EmployeeMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String n = sc.nextLine();
        System.out.println("Enter Address:");
        String a = sc.nextLine();
        System.out.println("Enter Mobile:");
        String m = sc.nextLine();
        Employee em = new Employee();
        System.out.println("Emplyee Details");
        em.setEmployee(n);
        System.out.println("Name:" + em.getEmployee());
        em.setAddress(a);
        System.out.println("Address:" + em.getAdress());
        if(Integer.parseInt(m)<0){
            System.out.println("Invalid Input");
            return;
        }else{
        em.setMobile(m);
        System.out.println("Mobile:" + em.getMobile());
    }
    }
}