public class basic {

        static int staticvar = 40;

        int instance = 60;
    public static void main(String[] args) {
        
        int localvar = 66 ;

        basic ob = new basic();

        System.err.println("Local variable " + localvar);

        System.err.println("Instance variable " + ob.instance);
        
        System.err.println("Static variable " + staticvar);



    }
}
