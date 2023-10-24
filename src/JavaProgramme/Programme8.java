package JavaProgramme;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if  any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet from 'A' to 'F': ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char alphabet = input.charAt(0);
            String cityName;

            if (alphabet == 'A') {
                cityName = "America";
            } else if (alphabet == 'B') {
                cityName = "Bombay";
            } else if (alphabet == 'C') {
                cityName = "Chennai";
            } else if (alphabet == 'D') {
                cityName = "Delhi";
            } else if (alphabet == 'E') {
                cityName = "Edingburgh";
            } else if (alphabet == 'F') {
                cityName = "Frankfurt";
            } else {
                cityName = "Invalid entry";
            }

            System.out.println("City Name: " + cityName);
        } else {
            System.out.println("Invalid entry. Please enter a single alphabet.");
        }

        scanner.close();
    }
}






