package JavaProgramme;

import java.util.Scanner;

/*
Write the java program to check if
enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        int pnz;
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        pnz = scanner.nextInt();
        if (pnz > 0) {
            System.out.println("Positive Number");
        } else if (pnz < 0) {
            System.out.println("Negative number");
        } else System.out.println("Neither positive nor Negative");

    }

    {


    }


}
