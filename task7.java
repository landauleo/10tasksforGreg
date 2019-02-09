//1.32
/** Известны объем и масса тела. Определить плотность материала этого тела. */

import java.util.Scanner;

public class task7{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int v = s.nextInt();
    Scanner w = new Scanner(System.in);
    int m = w.nextInt();
    int density = v*m;
    System.out.printf("плотность тела = %d\n", density);
   }
}
