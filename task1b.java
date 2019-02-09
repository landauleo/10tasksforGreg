//1.22
/**
вычисления значения функции x = 12a^2 + 7a - 16
при любом значении a
*/
import java.util.Scanner;

public class task1b{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int sum = 12*a*a + 7*a - 16;
    System.out.printf("x = %d\n", sum);
   }
}
