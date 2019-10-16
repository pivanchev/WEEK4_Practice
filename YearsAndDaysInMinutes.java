//Program that asks the user to enter theminutes and display the number of years and days for the minutes.
package week4_practice;
import java.util.Scanner;

public class YearsAndDaysInMinutes {
    
    public static int minutesInYear=525600;
    public static int minutesInDays=1440;
    
    
    public static void main(String args[]){
       
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of minutes: "); 
        int minutes=scan.nextInt();
        
        int years=minutes/minutesInYear;
        int remainingMinutes=minutes%minutesInYear;
        int days=remainingMinutes/minutesInDays;
        
        System.out.println(minutes + " minutes is roughly about " + years + " years and " + days + " days. ");
    
    
    }
}