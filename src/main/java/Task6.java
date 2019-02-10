//1.28 Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        double volume = getVolume(x);
        double square = getSquare(x);
        System.out.printf("объем куба = %d площадь боковой поверхности куба = %d\n", volume, square);
    }

    public static double getVolume(double x) {
        return x*x*x;
    }
    public static double getSquare(double x) {
        return 4*x*x;
    }


}
