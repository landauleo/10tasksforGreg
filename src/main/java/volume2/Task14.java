package volume2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num;
        for (int i = 0; i < 10; i++) {
            num = s.nextInt();
            list.add(num);
        }
        num = s.nextInt();

        System.out.println("Результат поиска числа: " + getNumber(list, num));
    }

    public static int getNumber(ArrayList<Integer> list, int num) {
        if (list.contains(num)) {
            return list.indexOf(num);
        } else return -1;
    }
}
