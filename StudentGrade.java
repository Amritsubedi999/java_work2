import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        System.out.print("Enter student's roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student's address: ");
        String address = sc.nextLine();
        System.out.print("Enter student's marks: ");
        double marks = sc.nextDouble();
        
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Address: " + address);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
