import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer : ");

        if(scanner.hasNext()){
            
            int a = scanner.nextInt();

            System.out.println("1st integer is : " + a);

            System.out.print("Enter the second integer : ");

            if(scanner.hasNext()){

                int b = scanner.nextInt();

                System.out.println( "Sum : " + (a + b));

            }

            else {

                System.out.println("Invalid Input");

            }
            
        }

        else {

            System.out.println("Invalid Input");

        }

        scanner.close();
        


    }
}
