//1.38 Даны основания и высота равнобедренной трапеции. Найти ее периметр.


import java.util.Scanner;

public class Task10 {


    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double o1 = a.nextInt(); //основание 1
        Scanner b = new Scanner(System.in);
        double o2 = b.nextInt(); //основание 2
        Scanner c = new Scanner(System.in);
        double h = c.nextInt(); // высота
        double perimeter = getPerimeter(o1, o2, h);
        System.out.println("perimeter = " + perimeter);
    }

    public static double getPerimeter(double o1, double o2, double h) {
        double katet = (o1 - o2)/2; //катет1 для треугольника внутри трапеции, катет2 - высота
        double hypotenuse = Math.sqrt(katet*katet)+Math.sqrt(h*h); //гипотенуза труегольника = боковая сторона р-б трапеции
        return o1+o2+hypotenuse;
    }

}
