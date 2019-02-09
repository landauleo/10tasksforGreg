//1.38
/** Даны основания и высота равнобедренной трапеции. Найти ее периметр.*/

import java.util.Scanner;

public class task10{

  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    double o1 = a.nextInt();
    Scanner b = new Scanner(System.in);
    double o2 = b.nextInt();
    Scanner c = new Scanner(System.in);
    double h = c.nextInt();
    double katet = (o1 - o2)/2;
    double gipotenuza = Math.sqrt(katet*katet + h*h);
    double sum = gipotenuza*2 + o1 + o2;
    System.out.printf("периметр равнобедренной трапеции = %.2f\n", sum);
   }
}
