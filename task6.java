//1.28
/**Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.*/

import java.util.Scanner;

public class task6{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int sum = r*2;
    System.out.printf("объем куба = %d площадь боковой поверхности куба = %d\n", sum, 4*sum);
   }
}
