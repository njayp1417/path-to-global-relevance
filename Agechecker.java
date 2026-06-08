public class Agechecker {
    public static void main(String[] args) {
        int age = 70;
        if (age < 18) {
            System.out.println("You are  a minor");

        }
        else if (age >= 18 && age <= 59) {
            System.out.println("You are adult");
        }
        else {
            System.out.println("You are a senior");
        }

    }
}
