
package week4_practice;
import java.util.Scanner;


public class SumOfTotalInputsAndCount {
    
    public static void main(String args[]){
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a positive number. Enter -1 to stop. ");
    
        int sum=0;
        int value=0;
        int tries=0;
        
        while(value!=-1){
            sum+=value;
            value=sc.nextInt();
            tries++;       }
        
        System.out.println("The sum of tried numbers is: " + sum);
        System.out.println("You have entered " + tries + " numbers ");
  }  
}
