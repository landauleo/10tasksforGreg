package volume3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Chapter1Task2 {
    public static void main(String[] args) {
        System.out.println("One string is a permutation of another: " + isStringPermutationV1("твойкодгdвно", "говнотвойкод"));
    }


    static boolean isStringPermutationV1(String str1, String str2) {
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        return Arrays.equals(sortedStr1, sortedStr2);

    }


    static boolean isStringPermutationV2(String str1, String str2) {
        char[] sortedStr1 = str1.toCharArray();
        char[] sortedStr2 = str2.toCharArray();
        Map<Character, Integer> counter = new HashMap<Character, Integer>();

        for (char ch : sortedStr1) {
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (char c : sortedStr2) {
            if (counter.containsKey(c)) {
                Integer newValue = counter.get(c) - 1;
                counter.put(c, newValue);
            }
            if (counter.get(c).compareTo(0) == 0) {
                counter.remove(c, counter.get(c));
            }
        }
        return counter.isEmpty();
    }
}



