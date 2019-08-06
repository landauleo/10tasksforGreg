package volume3;

import java.util.Arrays;

public class Chapter1Task2 {
    public static void main(String[] args) {
        System.out.println("One string is a permutation of another: " + isStringPermutation("твойкодговно", "говнотвойкод"));
    }

    public static boolean isStringPermutation(String str1, String str2) {
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        return Arrays.equals(sortedStr1, sortedStr2);

    }

}
