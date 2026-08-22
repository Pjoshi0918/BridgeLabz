// package 2nd_bridge_lab;
import java.util.Scanner;


public class first {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer : ");

        int n = scanner.nextInt();

        if(n > 0){

            System.out.println("Interger is Positive");
            
        }
        
        else if(n < 0){
            
            System.out.println("Interger is Negative");
            
        }
        
        else {
            
            System.out.println("Interger is zero");

        }

        scanner.close();

    }
}
