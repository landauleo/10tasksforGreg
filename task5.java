//1.26
/** Дан радиус окружности. Найти ее диаметр. */

import java.util.Scanner;

public class task5{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int sum = r*2;
    System.out.printf("диаметр окружности = %d\n", sum);
   }
}
