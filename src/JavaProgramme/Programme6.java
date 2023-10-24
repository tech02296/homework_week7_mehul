package JavaProgramme;
/*
. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        int y;
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        if(y%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }



    }
}
