//read the bill for a meal and the tip rate,then computes the tip and a new total for the bill.
package week4_practice;
import java.util.Scanner;


public class BillAndTip {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the bill: ");
        double bill=scan.nextDouble();
        System.out.print("Enter the tip rate: ");
        double tipRate=scan.nextDouble();
        
        System.out.println("How many people are dining?");//new total can be split evenly by the number of people dining
        int num=scan.nextInt();
        
        
        
        double tip=((tipRate/100)*bill);
        double total=bill + tip;
        
        double finalTotal=total/num;
        
        
        System.out.println("The tip is " + tip + " and the new total is " + total);
        System.out.println("Each person should pay " + finalTotal);
        
        
    }
    
}
