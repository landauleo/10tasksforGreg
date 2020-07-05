package volume2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = s.nextInt();
            arr[i] = num;
        }

        System.out.println("Так выглядит отсортированный массив: " + Arrays.toString(getSortedArray(arr)));
    }

    public static int[] getSortedArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
