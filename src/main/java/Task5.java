//1.26
/** Дан радиус окружности. Найти ее диаметр. */

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double r = s.nextInt();
        double diameter = getDiameter(r);
        System.out.println("diameter = " + diameter);
    }

    public static double getDiameter(double r) {
        return r*2;
    }

}
