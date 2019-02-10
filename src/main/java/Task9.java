//1.37 Даны катеты прямоугольного треугольника. Найти его периметр.

import java.util.Scanner;

public class Task9 {


    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double k1 = a.nextInt(); //катет1
        Scanner b = new Scanner(System.in);
        double k2 = b.nextInt(); //катет2
        double perimeter = getPerimeter(k1, k2);
        System.out.println("perimeter =  " + perimeter);
    }

    public static double getPerimeter(double k1, double k2) {
        return Math.sqrt(k1*k1)+Math.sqrt(k2*k2)+k1+k2;
    }

}
