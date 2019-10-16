
package week4_practice;
import java.util.Scanner;


public class TotalHoursWorked {

   
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        final double hour_rate=6.20;
        
        System.out.println("How many hours did you work this week? ");
        double hoursWorked=scan.nextDouble();
        
        double totalGross=hour_rate*hoursWorked;
        System.out.println("Your total gross pay for the week is " + totalGross);
        
        
        
        
    }
    
}
