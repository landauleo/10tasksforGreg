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
        String result = isPowerOfTwo(n) == true ? "Число является степенью двойки" :
                "Число является степенью двойки";
    }

    public static boolean isPowerOfTwo(int n) {
        //изящное решение, взятое из Cracking the Coding Interview
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
