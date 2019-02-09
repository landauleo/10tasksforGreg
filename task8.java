//1.35
/** Даны катеты прямоугольного треугольника. Найти его гипотенузу.*/

import java.util.Scanner;

public class task8{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    double k1 = s.nextInt();
    Scanner w = new Scanner(System.in);
    double k2 = w.nextInt();
    double gip1 = Math.sqrt(k1*k1);
    double gip2 = Math.sqrt(k2*k2);
    System.out.printf("гипотенуза = %.2f\n", gip1+gip2);
   }
}
