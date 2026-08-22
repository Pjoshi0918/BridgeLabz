// package 2nd_bridge_lab;

import java.util.Scanner;

public class Atm {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int Pin = 1234;

        int max_attempt = 3;

        for(int i = 1;i<=max_attempt;i++){
            
            System.out.print("Enter the pin code : ");
            int a = sc.nextInt();

            if(Pin == a){

                System.out.println("Access granted");
                break;

            }
            else if(i == 3) {

                System.out.println("Card Blocked");
                
            }
            
            else {
                
                System.out.println("Incorrect Pin ," + (3 - i) + "attempts remaining");

            }

        }

        sc.close();

    }

}
