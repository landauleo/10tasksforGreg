package volume3;

import java.util.HashMap;
import java.util.Map;

public class Chapter1Task5 {
    public static void main(String[] args) {
        System.out.println("One string is a permutation of another: " + areStringsOneEdit("pale", "pales"));
    }


    static boolean areStringsOneEdit(String str1, String str2) {
        Integer newValue = 0;
        int removalIndex = 0;
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Map<Character, Integer> counter = new HashMap<Character, Integer>();

        for (char ch : charArr1) {
            if (counter.containsKey(ch)) {
                counter.put(ch, counter.get(ch) + 1);
            } else {
                counter.put(ch, 1);
            }
        }

        for (char c : charArr2) {
            if (counter.isEmpty()) {
                removalIndex--;
            } else {
                if (counter.containsKey(c)) {
                    newValue = counter.get(c) - 1;
                    counter.put(c, newValue);
                    if (counter.get(c).compareTo(0) == 0) {
                        counter.remove(c, counter.get(c));
                    }
                } else {
                    removalIndex--;
                }
            }
        }
        return ((counter.size() == 1) && (removalIndex == 0)) || ((counter.isEmpty()) && (removalIndex == -1)) || ((counter.size() == 1) && (removalIndex == -1));
    }
}



