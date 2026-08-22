import java.util.Scanner;

public class arthmetic {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first Number :");
        
        int a = scanner.nextInt();

        System.out.print("Enter the second Number :");
        
        int b = scanner.nextInt();

        System.out.println("Sum : " + (a + b));
        System.out.println("differnce : " + (a - b));
        System.out.println("Product : " + (a * b));
        
        if(b != 0){
         
            System.out.println("Quotient : " + (a / b));
            System.out.println("remainder : " + (a % b));

        }

        scanner.close();

    }
}
