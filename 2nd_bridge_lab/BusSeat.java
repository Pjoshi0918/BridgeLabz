// package 2nd_bridge_lab;

import java.util.Scanner;

public class BusSeat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int CAPACITY = 40;

        boolean[] booked = new boolean[CAPACITY+1];

        int filled = 0;

        for(int i = 1;i<= CAPACITY;i++){

            booked[i] = false;

        }

        while (true) {

            if(filled == CAPACITY){

                System.out.println("Bus Full");
                break;

            }
            
            System.out.print("Enter the seat number : ");
            int seat = sc.nextInt();

            if(seat >= CAPACITY || seat < 0){
                
                System.out.println("Invalid seat number , Type again .");
                continue;

            }
            
            if(booked[seat]) {
                
                seat = seat + 1;

                while(booked[seat]){

                    seat = (seat + 1) % CAPACITY;

                }

                booked[seat] = true;
                System.out.println("Seat Number " + seat + " is available and booked");
                filled ++;
                continue;

            }

            booked[seat] = true;
            System.out.println("Seat Number " + seat + "is available and booked");
            filled ++;
            
        }
        
        sc.close();


    }
}
