//user to read 2 whole integers and display their sum. Inform user to read if incorrect.Try/catch statement.

package week4_practice;
import java.util.Scanner;


public class SumAndException {
    
    
  
  public void input(){
      
      
       try{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num=scan.nextInt();
        System.out.println("Enter the second number: ");
        int num1=scan.nextInt();
        
        int sum=num+num1;
        
        System.out.println("The sum of the numbers is " + sum + ".");
         
        }catch(Exception e){
            
            System.out.println("You must enter in two whole numbers!");
            
                }
  }
    public static void main(String args[]){
        
        SumAndException inp=new SumAndException();
        inp.input();
       
                
        
        
    } 
}
