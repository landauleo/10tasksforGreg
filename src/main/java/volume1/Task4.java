package volume1;//1.27
/** Считая, что Земля — идеальная сфера с радиусом R ~ 6350 км. определить
 расстояние до линии горизонта от точки с высотой над Землей */


import java.util.Scanner;

public class Task4 {


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x = s.nextInt();
        double destination = getDestination(x);
        System.out.println("Destination = " + destination);
    }

    public static double getDestination(double x) {
        return Math.sqrt(x*(2*6350000 + x));
    }

}
