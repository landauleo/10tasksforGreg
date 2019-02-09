//1.23
/**
 Составить программу вычисления значения функции y= (a^2 + 10) / sqrt(a^2 +1)
 при любом значении а */

import java.util.Scanner;

public class task2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double sum = getSum(a);
        System.out.println("y = " + sum);
    }

    public static double getSum(double a) {
        return (a * a + 10) / Math.sqrt(a * a + 1);
    }
}
