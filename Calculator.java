public class Calculator {
    public static void main(String[] args) {
        double num1 = 7;
        double num2 = 5;
        String operator = "-";
        
        if (operator.equals("+")) {
            System.out.println(num1 + num2);

        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);


        }else if (operator.equals("*")) {
            System.out.println(num1 * num2);

        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println(num1 / num2);
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            }
    }
}
