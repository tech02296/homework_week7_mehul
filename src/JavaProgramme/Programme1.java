package JavaProgramme;
/*
Write a java program that tells us that Input number is odd or even?
use ternary operator (? :)

 */

import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd" ;//ternary operator
        System.out.println("Number is : "+result );

    }
}
