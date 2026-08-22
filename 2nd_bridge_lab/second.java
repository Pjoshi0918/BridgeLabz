// package 2nd_bridge_lab;
import java.util.Scanner;

public class second {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Roll Number : ");

        int roll_no = scanner.nextInt();

        if(roll_no % 2 ==  0){

            System.out.println("Roll Number is Even");
            
        }
        
        else {
            
            System.out.println("Roll Number is Odd");

        }

        scanner.close();

    }

}
