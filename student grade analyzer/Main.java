
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeAnalyzer analyzer = new GradeAnalyzer();

        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nEnter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of grades: ");
            int gradeCount = scanner.nextInt();
            int[] grades = new int[gradeCount];

            for (int j = 0; j < gradeCount; j++) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                grades[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            Student student = new Student(name, grades);
            analyzer.addStudent(student);
        }

        System.out.println("\n--- Grade Report ---");
        analyzer.displayReport();

        scanner.close();
    }
}
