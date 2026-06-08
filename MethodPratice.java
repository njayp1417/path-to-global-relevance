public class MethodPratice {
    static double add(double a, double b) {
        return a + b;
    }

    static double multiply ( double a, double b) {
        return a * b;
    }

    static String greet(String name) {
        return "Hello, " + name ;
    }

    public static void main(String[] args) {
        System.out.println(add(64, 36));
        System.out.println(multiply(5, 7));
        System.out.println(greet("Nelson"));
    }
}
