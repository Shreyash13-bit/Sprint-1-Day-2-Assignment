import java.util.*;

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add 2. Remove 3. Search 4. Display All 5. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Grade: ");
                double grade = sc.nextDouble();
                students.add(new Student(id, name, grade));
                System.out.println("Student added.");
            } else if (choice == 2) {
                System.out.print("Enter ID to remove: ");
                int id = sc.nextInt();
                students.removeIf(s -> s.id == id);
                System.out.println("Student removed.");
            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                for (Student s : students) {
                    if (s.id == id) {
                        System.out.println("Found: " + s.name + ", Grade: " + s.grade);
                    }
                }
            } else if (choice == 4) {
                for (Student s : students) {
                    System.out.println(s.id + " " + s.name + " " + s.grade);
                }
            } else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}
