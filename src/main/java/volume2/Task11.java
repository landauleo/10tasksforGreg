package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Является ли число степенью двойки: " + getPowerOfTwo(n));
    }

    public static String getPowerOfTwo(int n) {
        if ((n > 0) && ((n & (n - 1)) == 0)) //изящное решение, взятое из Cracking the Coding Interview
            return "да";
        else
            return "нет";
    }
}
