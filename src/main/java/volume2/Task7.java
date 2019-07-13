package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Result: "+getResult(a));
    }
    
    public static int getResult(int a) {
        int result = 1;
        for (int i = 1; i <=a; i++){
            result = result*i;
        }
        return result;
    }
}
