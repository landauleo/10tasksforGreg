//1.25
/** Дана сторона квадрата. Найти его периметр. */

import java.util.Scanner;

public class task3 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        double per = getPer(x);
        System.out.println("y = " + per);
    }

    public static double getPer(double x) {
        return 4*x;
    }

}
