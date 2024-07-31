package co.tns.exception;


public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Element at index 5: " + numbers[5]); // This will cause ArrayIndexOutOfBoundsException

            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Message: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: ArithmeticException");
            System.out.println("Message: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception caught: General Exception");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
