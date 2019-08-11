package volume3;

import java.util.Arrays;

public class Chapter1Task2 {
    public static void main(String[] args) {
        System.out.println("One string is a permutation of another: " + isStringPermutationV2("твойкодговно", "говнотвойкод"));
    }


    static boolean isStringPermutationV1(String str1, String str2) {
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        return Arrays.equals(sortedStr1, sortedStr2);

    }

    public static boolean isStringPermutationV2(String str1, String str2) {
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();

        return Arrays.equals(customSort(sortedStr1), customSort(sortedStr2));

    }

    public static char[] customSort (char[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}



