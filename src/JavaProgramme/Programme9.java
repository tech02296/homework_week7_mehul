package JavaProgramme;
/*
Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter an alphabet A to F: ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        String cityName = null;

        switch (alphabet) {
            case 'A':
                cityName = "America";
                break;
            case 'B':
                cityName = "Bombay";
                break;
            case 'C':
                cityName = "Chennai";
                break;
            case 'D':
                cityName = "Delhi";
                break;
            case 'E':
                cityName = "Edingburgh";
                break;
            case 'F':
                cityName = "Frankfurt";
                break;
            default:
        }
        System.out.println("City Name: " + cityName);
        scanner.close();
    }
}


