import java.util.Scanner;

public class ass2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string  : ");

        String a = scanner.next();
        
        System.out.println("Enter second : ");
        
        String b = scanner.next();
        
        System.out.println("Before  First a is : " + a + " and second b is : " + b);
        
        String temp = a;
        
        a = b;
        
        b = temp;
        
        System.out.println("After Swapping  a is : " + a + " and second integer b is : " + b);

        scanner.close();


    }
}
