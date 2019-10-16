
package week4_practice;
import java.util.Scanner;


public class NumberSize {
  
  public void numberSize(){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=s.nextInt();
        if(num>50){
            System.out.println(num + " is a big number.");
        }else if(num<50){
            System.out.println(num + " is a small number.");
        }else {
            System.out.println(num + " is the middle number.");
        }
  }
    public static void main(String args[]){
        
        NumberSize size=new NumberSize();
        size.numberSize();
      
    }
    
}
