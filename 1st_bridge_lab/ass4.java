import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int celsius = scanner.nextInt();

        double fahrenheit = (celsius) * (9.0/5) + 32;

        System.out.println(fahrenheit);

    }
}
