package JavaProgramme;
/*Write a java program to print the numbers between 1 to 100
 which can be divided by 3  and 5 separately.
 */

public class Programme11 {
    public static void main(String[] args) {
        System.out.println("Number divide by 3");

        for(int n = 1;n<=100;n++) {
            if (n % 3 == 0) {
                System.out.println(n + ",");

            }
            System.out.println();
        }
        for(int n =1;n<=100;n++) {
            if (n % 5 == 0) {
                System.out.println(n + ",");
            }
        }
        System.out.println();
        System.out.println("Number divide by 5");
        for(int n=1;n<100;n++)
        {
            if(n%3==0 && n%5==0)
            {
                System.out.println(n+" ,");
            }




        }


    }
}
