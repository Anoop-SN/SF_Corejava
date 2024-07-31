package co.tns.exception;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Outer try block");
            
            try {
                // Inner try block 1
                System.out.println("Inner try block 1");
                int result = arr[1] / 0; // This will cause ArithmeticException
                System.out.println("Result: " + result);
                
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try block 1: " + e.getMessage());
            }

            try {
                // Inner try block 2
                System.out.println("Inner try block 2");
                System.out.println("Element at index 5: " + arr[5]); // This will cause ArrayIndexOutOfBoundsException
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException in inner try block 2: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("Caught Exception in outer try block: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
