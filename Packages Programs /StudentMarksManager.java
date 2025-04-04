import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> studentData = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            ArrayList<Integer> marks = new ArrayList<>();
            System.out.print("Enter 3 subject marks: ");
            for (int j = 0; j < 3; j++) {
                marks.add(scanner.nextInt());
            }
            studentData.put(name, marks);
        }

        System.out.println("\nStudent Details:");
        for (String student : studentData.keySet()) {
            ArrayList<Integer> marks = studentData.get(student);
            int total = marks.stream().mapToInt(Integer::intValue).sum();
            System.out.println(student + " - Total: " + total + ", Average: " + (total / 3.0));
        }
        scanner.close();
    }
}
