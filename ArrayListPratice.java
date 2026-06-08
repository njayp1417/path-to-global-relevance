import java.util.ArrayList;

public class ArrayListPratice { 
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Nelson");
        students.add("Asagwara");
        students.add("Ekene");
        students.add("chukwu");

        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));


        } 
        students.remove("Ekene");
        System.out.println("Total Students: "+ students.size() );

    }
}
