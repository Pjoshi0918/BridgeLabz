import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first subject marks : ");
        
        int mark1 = sc.nextInt();

        System.out.print("Enter second subject marks : ");
        
        int mark2 = sc.nextInt();

        if(mark1 > 40 && mark2 > 40){

            System.out.println("Pass");
            
        }
        
        else{
            
            System.out.println("Fail");

        }


    }

}
