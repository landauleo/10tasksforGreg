//1.32 Известны объем и масса тела. Определить плотность материала этого тела.

import java.util.Scanner;

public class task7 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double v = s.nextInt();
        Scanner w = new Scanner(System.in);
        double m = w.nextInt();
        double density = getDen(v,m);
        System.out.println("density = " + density);
    }

    public static double getDen(double v, double m) {
        return v*m;
    }

}
