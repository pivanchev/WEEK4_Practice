
package week4_practice;
import java.util.Scanner;


public class Week21_10_19 {
    public static void main(String args[]){
        
        
        
      //  bakecake();
      //  doWhileExample();
      //  SeriesOfNumbers();
      //  repeatName();
      //    numbers();
      //  timesTable();
      //  findLetter();
          findString1(); 
    }
    public static void bakecake(){
        System.out.println("1. Flour");
        System.out.println("2. Eggs");
        System.out.println("3. Milk");
        System.out.println("4. Baking soda");
        
        
        for(int i=0;i<=10;i++){
        System.out.println("5. Sugar 1 tap");
        }
        
        System.out.println("6. Chocolate");
        
        for(int i=0;i<=100;i++){
        System.out.println("7. Mix 1");
        }
        
        System.out.println("8. Bake it");
        
        for(int i=0;i<=7;i++){
        System.out.println("9. Add cream");
        }
        int i=8;
        while(i<8){
        System.out.println("10. Eat one slice");
        i++;
        }
    }    
    
    public static void doWhileExample(){
        int i=0;
        
        do{
            System.out.println("Some code.");
            i++;
        }while(i<10);//if i=10, execute at least once
    }
    
    public static void SeriesOfNumbers(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter some numbers: ");

        int sum=0;
        int value=0;
        do{
             System.out.print("Please enter some numbers: ");
              
            value=sc.nextInt();
            sum+=value;
        }while(value!=0);
           
            System.out.println(sum);
            
            
           
        } 
                  
        
        public static void repeatName(){
            for(int i=0;i<=5;i++)                
            
            System.out.println("Plamen Ivanchev");
        }
        
        
        public static void numbers(){
            for(int i=5;i<=15;i++)
                System.out.println(i);
        }
        
        
        
        public static void timesTable(){
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Please enter the multiplier: ");
            int multiplier=sc.nextInt();
            System.out.println("Please enter the starting number: ");
            int startNum=sc.nextInt();
            System.out.println("Please enter the ending number: ");
            int ending_Number=sc.nextInt();
            
            for(int i=4;i<=7;i++){
                System.out.println(i*3);
            }
                
        }
           
        
        public static void findLetter(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the string: ");
            String name = sc.nextLine();
            System.out.println("Please enter the letter you want to find: ");
            char r=sc.next().charAt(0);
            
            
        //    System.out.println(name.length());//15
            int count=0;
            for(int i=0;i<name.length();i++)
            if(name.charAt(i)==r){
                count++;
                System.out.println(count); 
                System.out.println(r+1);
            } 
            
           
        }
        
        
        public static void findString1(){
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a string: ");
            String input=sc.nextLine();
            
            
            System.out.println(" ODD  EVEN ");
            System.out.println("-------------");
            for(int i=0;i<input.length()-1;i++){
                int num=Character.getNumericValue(input.charAt(i));
                
                if(num%2==1){
                    
                    System.out.print(input.charAt(i));
                }else{
                    System.out.println("\t" + input.charAt(i));
                }
            }
             
       
        }
     }
        
        
     

 
