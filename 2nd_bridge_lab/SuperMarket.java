// package 2nd_bridge_lab;

import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the total number if items : ");
        
        int n = sc.nextInt();

        double total = 0;

        for(int i = 0; i< n;i++){

            System.out.println("Item price is : ");

            double a = sc.nextDouble();

            total += a;

        }

        System.out.println("Total price is : " + total );

        sc.close();

    }
    
}
