//1.32 Известны объем и масса тела. Определить плотность материала этого тела.

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double v = s.nextInt();
        Scanner w = new Scanner(System.in);
        double m = w.nextInt();
        double density = getDensity(v,m);
        System.out.println("density = " + density);
    }

    public static double getDensity(double v, double m) {
        return v*m;
    }

}
