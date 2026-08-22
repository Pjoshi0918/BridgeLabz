public class MaxValues {
    public static void main(String[] args) {

        System.out.println("Byte Overflow (Without Cast) : " + (Byte.MAX_VALUE + 1));       
        System.out.println("Byte Overflow (With Cast)    : " + (byte)(Byte.MAX_VALUE + 1)); 
        System.out.println("Short Overflow (With Cast)   : " + (short)(Short.MAX_VALUE + 1));
        System.out.println("Integer Overflow             : " + (Integer.MAX_VALUE + 1));  
        System.out.println("Long Overflow                : " + (Long.MAX_VALUE + 1));      
    
        System.out.println("\nByte underflow (Without Cast) : " + (Byte.MIN_VALUE - 1));       
        System.out.println("Byte underflow (With Cast)    : " + (byte)(Byte.MIN_VALUE - 1));  
        System.out.println("Short underflow (With Cast)   : " + (short)(Short.MIN_VALUE - 1));
        System.out.println("Integer underflow             : " + (Integer.MIN_VALUE - 1));    
        System.out.println("Long underflow                : " + (Long.MIN_VALUE - 1));     
    
    
    }
}