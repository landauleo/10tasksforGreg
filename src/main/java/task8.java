//1.35 Даны катеты прямоугольного треугольника. Найти его гипотенузу.

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double k1 = s.nextInt(); //катет1
        Scanner w = new Scanner(System.in);
        double k2 = w.nextInt(); //катет2
        double hypotenuse = getHypotenuse(k1, k2);
        System.out.println("hypotenuse = " + hypotenuse);
    }


    public static double getHypotenuse(double k1, double k2) {
        return Math.sqrt(k1*k1)+Math.sqrt(k2*k2);
    }
}
