//1.27
/** Считая, что Земля — идеальная сфера с радиусом R ~ 6350 км. определить
 расстояние до линии горизонта от точки с высотой над Землей */

import java.util.Scanner;

public class task4{
  public static final int RAD = 6350000;

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int sum = Math.sqrt(a*(2*RAD + a));
    System.out.printf("расстояние до линии горизонта = %d метров\n", sum);
   }
}
