package JavaProgramme;
/*
. Write a Java program to sum values of an array
 */

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Arrays value");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
            sum = a[i] + sum;
        }
        System.out.println("Addition of arrays value =" + sum);


    }

}
