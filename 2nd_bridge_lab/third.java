// package 2nd_bridge_lab;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");

        double a = sc.nextDouble();
        
        System.out.print("Enter the Second Number : ");

        double b = sc.nextDouble();

        boolean t = true;
        
        while(t){
            
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            
            switch (choice) {

                case 1:
                    System.out.println("Addition of two numbers is :" + (a + b) );
                    break;

                case 2 :
                    System.out.println("Substration of two numbers is :" + (a - b) );
                    break;
                
                case 3 : 
                    System.out.println("Multiplication of two numbers is :" + (a * b) );
                    break;

                case 4 : 
                    System.out.println("Division of two numbers is :" + (a/b));
            
                default:
                    System.out.println("You have Entered Wrong Choice . Choose between 1 to 4 If you want ot countinue");
                    t = false;
                    break;
            
                }
       
            }
            sc.close();


    }
}
