package JavaProgramme;

import java.util.Scanner;

public class Programme3     {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        // Input marks for Math, Science, and English
        System.out.print("Enter Math Marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science Marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English Marks (0-100): ");
        int englishMarks = scanner.nextInt();

        // Validate marks
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");

        }

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine the result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = "";
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        // Print the mark sheet
        System.out.println("_______________________________");
        System.out.println("| |");
        System.out.println("| Mark Sheet |");
        System.out.println("|_______________________________|");
        System.out.println("| Name : " + name + " |");
        System.out.println("| Roll No: " + rollNo + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks |");
        System.out.println("|_______________________________|");
        System.out.println("| Math : " + mathMarks + " |");
        System.out.println("| Science : " + scienceMarks + " |");
        System.out.println("| English : " + englishMarks + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Total : " + totalMarks + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage : " + percentage + " |");
        System.out.println("| Result : " + result + " |");
        System.out.println("| Grade : " + grade + " |");
        System.out.println("|_______________________________|");

        scanner.close();
    }


}
