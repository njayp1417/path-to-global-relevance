public class GradingSystem {
    

    static double calculateAverage(int[] scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total / scores.length;

    }
    static String getGrade(double average) {

        if (average >= 70) {
            return "A";
        
        }
        else if (average >=50 && average < 70) {
            return "B";

        }
        else {
            return "F";
        } 
    }
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        double average = calculateAverage(scores);
        String grade = getGrade(average);

        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);
    }

}
