//user input for volume and perimeter of a box 
package week4_practice;
import java.util.Scanner;


public class VolumeAndPerimeter {
    public static void main(String args[]) {
            
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter in the height: ");
        int height=scan.nextInt();
        System.out.print("Please enter in the width: ");
        int width=scan.nextInt();
        System.out.print("Please enter in the depth: ");
        int depth=scan.nextInt();
       
        int perimeter=4*height+4*width+4*depth;
        int volume=height*width*depth;
       
       
        System.out.println("The box is 2cm high, 3cm high and 4cm deep.");
        System.out.println("The volume of the box is " + volume + "cms cubed.");
        System.out.println("The perimeter of the box is " + perimeter + "cms.");
       
    }
    
}
