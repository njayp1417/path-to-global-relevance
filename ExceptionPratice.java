public class ExceptionPratice {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);


        } catch (ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage() );

        }
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Error caught: " + e.getMessage());

        } finally {
            System.out.println("This block always executes. ");
        }


    }
}