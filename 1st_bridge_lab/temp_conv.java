import java.util.Scanner;

public class temp_conv {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int celsius = scanner.nextInt();

        double fahrenheit = Math.fma(celsius, 1.8, 32);

        double f = Math.round((celsius)*1.8 + 32);

        System.out.println(fahrenheit);
        System.out.println(f);

        
    }
}
