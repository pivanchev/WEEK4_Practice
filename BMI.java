//calculate BMI by taking your weight in km and dividing by the square of your height in meters

package week4_practice;
import java.util.Scanner;

public class BMI {
    final static double poundToKg=0.4539237;
    final static double inchToCm=0.0254;
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds=scan.nextDouble();
        System.out.print("Enter height in inches: ");
        double height=scan.nextDouble();
        
        double weightInKg=poundToKg*pounds;
        double heightInCm=inchToCm*height;
        
        double bmi=weightInKg/(heightInCm*heightInCm);
        
        System.out.println("BMI is " + bmi);
        
        
    } 
}
