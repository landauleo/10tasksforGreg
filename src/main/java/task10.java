//1.38 Даны основания и высота равнобедренной трапеции. Найти ее периметр.


import java.util.Scanner;

public class task10 {


    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double o1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        double o2 = b.nextInt();
        Scanner c = new Scanner(System.in);
        double h = c.nextInt();
        double perimeter = getPer(o1, o2, h);
        System.out.println("perimeter = " + perimeter);
    }

    public static double getPer(double o1, double o2, double h) {
        double katet = (o1 - o2)/2; //катет1 для треугольника внутри трапеции, катет2 - высота
        double hypo = Math.sqrt(katet*katet)+Math.sqrt(h*h); //гипотенуза труегольника = боковая сторона р-б трапеции
        return o1+o2+hypo;
    }

}
