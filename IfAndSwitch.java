
package week4_practice;
import java.util.Scanner;


public class IfAndSwitch {
    
    public void getMonth(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a month number: ");
        int month=sc.nextInt();
        
        if(month==1){
            System.out.println("Month " + month + " is January.");
        }else if(month==2){
            System.out.println("Month " + month + " is February.");
            
        }else if(month==3){
            System.out.println("Month " + month + " is March.");
        
        }else if(month==4){
            System.out.println("Month " + month + " is April.");
        
        }else if(month==5){
            System.out.println("Month " + month + " is May.");
            
        }else if(month==6){
            System.out.println("Month " + month + " is June.");    
            
         }else if(month==7){
            System.out.println("Month " + month + " is July.");  
            
          }else if(month==8){
            System.out.println("Month " + month + " is August."); 
            
          }else if(month==9){
            System.out.println("Month " + month + " is September.");  
            
          }else if(month==10){
            System.out.println("Month " + month + " is October.");
            
          }else if(month==11){
            System.out.println("Month " + month + " is November.");
            
          }else if(month==12){
            System.out.println("Month " + month + " is December."); 
            
          }else{
              System.out.println("Please enter a valid month number. ");
          }
    }
    
    
    public void getMonth2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a month number: ");
        int month=sc.nextInt();
        
        switch(month){
        case 1:System.out.println("Month " + month + " is January.");
            break;
              
        case 2:System.out.println("Month " + month + " is February.");
            break;
               
        case 3:System.out.println("Month " + month + " is March.");
             break;
        
        case 4:System.out.println("Month " + month + " is April.");
             break;
              
        case 5:System.out.println("Month " + month + " is May.");
             break;
                  
        case 6:System.out.println("Month " + month + " is June.");    
             break;
                    
        case 7:System.out.println("Month " + month + " is July.");  
             break; 
                  
        case 8:System.out.println("Month " + month + " is August.");
             break;
                  
        case 9:System.out.println("Month " + month + " is September."); 
             break;
            
         
        case 10:System.out.println("Month " + month + " is October.");
             break;           
        
        case 11:System.out.println("Month " + month + " is November.");
             break;
            
        case 12:System.out.println("Month " + month + " is December."); 
             break;
                   
        default: System.out.println("Please enter a valid month number. ");
             break;
            
            
          }
    }
    public static void main(String args[]){
        
        IfAndSwitch mon=new IfAndSwitch();
        mon.getMonth();
        mon.getMonth2();
        

    }
    
}
