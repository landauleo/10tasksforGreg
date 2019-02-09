//1.22
/**
 вычисления значения функции x = 12a^2 + 7a - 16
 при любом значении a
 */

import java.util.Scanner;

public class task1b {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double sum = getSum(a);
        System.out.println("y = " + sum);
    }

    public static double getSum(double a) {
        return 12*a*a + 7*a - 16;
    }

}