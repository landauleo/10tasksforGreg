//1.37
/** Даны катеты прямоугольного треугольника. Найти его периметр.*/

import java.util.Scanner;

public class task9{

  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    double k1 = a.nextInt();
    Scanner b = new Scanner(System.in);
    double k2 = b.nextInt();
    double gip1 = Math.sqrt(k1*k1);
    double gip2 = Math.sqrt(k2*k2);
    System.out.printf("периметр прямоуголльного треугольника = %.2f\n", gip1+gip2+k1+k2);
   }
}
