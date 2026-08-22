// package 2nd_bridge_lab;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age >= 0 && age <=12){

            System.out.println("Category is Child");
            
        }
        else if (age > 12 && age < 20) {
            
            System.out.println("Category is Teenager");
            
        }
        
        else if(age >19 && age < 60){
            
            System.out.println("Category is Adhult");
            
        }
        
        else{
            
            System.out.println("Category is Senior");

        }

        sc.close();


    }
}
