package volume3;

import java.util.HashMap;
import java.util.Map;

public class Chapter1Task4 {

    public static void main(String[] args) {
        System.out.println("Is string a permutation of a palindrome: " + isPalindromePermutation("Tact coa"));
    }

    public static boolean isPalindromePermutation(String string) {
        char[] chars = string.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        int index = 0;

        for (char ch : chars) {
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                index++;
            }
        }
        return index == 1 || index == 0;
    }
}

//time-complexity O(2*n) -> 2 loops give us O(N+N), space-complexity O(1) -> extra space is not dependent on the size of the input size itself
