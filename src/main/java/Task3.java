//1.25
/** Дана сторона квадрата. Найти его периметр. */

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        double perimeter = getPerimeter(x);
        System.out.println("y = " + perimeter);
    }

    public static double getPerimeter(double x) {
        return 4*x;
    }

}
