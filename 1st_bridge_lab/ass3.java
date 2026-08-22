import java.util.Scanner;

public class ass3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms you want the sum of Fibonacci series up to: ");
        
       
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The sum of " + n + " terms is: 0");
            scanner.close();
            return;
        }

        int a = 0, b = 1;
        int sum = a + (n > 1 ? b : 0); // sum first two terms if n > 1

        // Generate Fibonacci numbers and sum them
        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
        scanner.close();
    }
}