import java.util.HashMap;

public class HashMapPratice {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Nelson", 85);
        scores.put("Asagwara", 90);
        scores.put("Ekene", 78);
        scores.put("Chukwu", 92);

        System.out.println("Nelson's score: " + scores.get("Nelson"));

        scores.put("Ekene", 88); 

        for( String name : scores.keySet() ) {
            System.out.println(name + ": " + scores.get(name));


        }
        System.out.println("Total students: " + scores.size());

        String fullName = "  nelson asagwara  ";
        System.out.println(fullName.trim());
        System.out.println(fullName.trim().toUpperCase());
        System.out.println(fullName.trim().length());
        System.out.println(fullName.trim().contains("nelson"));
        System.out.println(fullName.trim().replace("nelson", "Nelson"));

    }
} 

