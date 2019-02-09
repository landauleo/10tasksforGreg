//1.26
/** Дан радиус окружности. Найти ее диаметр. */

import java.util.Scanner;

public class task5 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double r = s.nextInt();
        double sum = getDia(r);
        System.out.println("diameter = " + sum);
    }

    public static double getDia(double r) {
        return r*2;
    }

}
