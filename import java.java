import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3, s4;
        int total;
        double average;
        char grade;

        System.out.print("Enter marks of Subject 1: ");
        s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        s3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        s4 = sc.nextInt();

        total = s1 + s2 + s3 + s4;
        average = total / 4.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}