//1.22
/**
вычисления значения функции y = 7x^2 - 3x + 6
при любом значении x
*/
import java.util.Scanner;

public class task1a{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int sum = 7*x*x-3*x+6;
    System.out.printf("y = %d\n", sum);
   }
}
