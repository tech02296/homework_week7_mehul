package JavaProgramme;

import java.util.Scanner;

/*
Write a Java program which input any number
between 1 to 7 and it print The Days  name
MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Proramme13 {
    public static void main(String[] args) {
        int d;
        System.out.println("Enter Day");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();
        switch (d)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendsesday");
                break;
            case 4:
                System.out.println("Thuresday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }


    }

}
