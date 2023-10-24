package JavaProgramme;

import java.util.Arrays;

/*
Write a Java program to sort a numeric array and a string array
 */
public class Programme17 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,};
        String[] name = {"Java","Python","C"};
        System.out.println("Original value: " +Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sorted value: "+ Arrays.toString(number));
        System.out.println("Original value:"+ Arrays.toString(name));
        String[] name1 = name;
        for (String string : (name)) {
            System.out.println("Sorted value : "+Arrays.toString(name));
        }


    }
}
