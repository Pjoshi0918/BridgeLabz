// package 2nd_bridge_lab;

import java.util.Scanner;

public class CinemaHall {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int rows = 5;

        int columns = 10;

        char a = 'A' -1;

        for(int i = 0; i < rows;i++){

            a += 1  ;

            for(int j = 1;j <= columns;j++){

                System.out.print(a + "" +j + "");
                // System.out.print(j);
                System.out.print(" ");
                
            }

            System.out.println("");

        }


        sc.close();

    }
}
