public class ArrayPratice {
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88};
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(" Score " + (i+1) + ": " +  scores[i] );

        }

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("Total: " + total);
    }
}
