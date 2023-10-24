package JavaProgramme;
/*
Write a java program to input any year like  and find out if it is leap year or  not?
 */

import java.util.Scanner;

public class Programme2 {
    //1. century (100%=0 and 400%=0)
    //2.yearly   (100%!=0 and 4%=0)
    public static void main(String[] args) {
        int y;
        System.out.println("Enter any year");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        if (y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }

}
