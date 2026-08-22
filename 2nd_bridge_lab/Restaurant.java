// package 2nd_bridge_lab;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double total = 0;

        boolean a = true;

        do {
            
            System.out.println("1.Burger | Rs 120 ");
            System.out.println("2. Pizza | Rs 250 ");
            System.out.println("3. Pasta | Rs 180 ");
            System.out.println("4. Exit ");
            System.out.println("Current Total = " + (total));



            System.out.print("Enter the item number : ");
            
            int more = sc.nextInt();

            switch (more) {
                case 1:
                    System.out.println("1.Burger | Rs 120 ");
                    total += 120;                    
                    break;

                case 2:
                    System.out.println("2. Pizza | Rs 250 ");
                    total += 250;
                    break;

                case 3:
                    System.out.println("3. Pasta | Rs 180 ");
                    total += 180;
                    
                    break;
            
                default:
                    a = false;
                    break;
            }
        } while (a);

        double tax = total*(5.0/100);

        double GrandTotal = total + tax;

        System.out.println("Total bill after tax is  " + GrandTotal);

        sc.close();

    }
}
