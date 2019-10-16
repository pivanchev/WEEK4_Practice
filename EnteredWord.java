//write a program that will display the word entered by the user.

package week4_practice;
import java.util.Scanner;


public class EnteredWord {
    public static void main(String args[]){
        Scanner key=new Scanner(System.in);
        System.out.print("Enter word: ");
        String word=key.nextLine();
        System.out.println("The entered word is: " + word);
        
        
    }
    
}
