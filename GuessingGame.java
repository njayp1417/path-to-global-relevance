public class GuessingGame {
    public static void main(String[] args) {
        int  secretNumber = 42;
        int userGuess = 30;

        if (userGuess < secretNumber) {
            System.out.println("Too low! Try again.");
        } else if (userGuess > secretNumber) {
            System.out.println("Too high! Try again");

        }else {
            System.out.println("Congratulations! You've guessed the number!");
        }
    
        }
}

