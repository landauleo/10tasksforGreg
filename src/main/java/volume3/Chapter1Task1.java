package volume3;
/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Chapter1Task1 {

    public static void main(String[] args) {
        System.out.println("Uniqueness of chars: " + areCharsUnique2("asdfghjkl"));
    }

    public static boolean areCharsUnique1(String string) {
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.toCharArray()[i] == string.toCharArray()[j]) {
                    return false;
                }
            }
        }
        return true;
    } //time-complexity O(n^2) worst, O(n^2) average, O(1) best, space-complexity O(1) -> extra space is not dependent on the size of the input size itself

    public static boolean areCharsUnique2(String string) {
        char[] chars = string.toCharArray();

        Arrays.sort(chars);
        for (int i = 0; i < (chars.length - 1); i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    } //time-complexity O(n) worst, O(n*log(n)) average, O(1) best ; space-complexity O(1) -> extra space is not dependent on the size of the input size itself

    public static boolean areCharsUnique3(String string) {
        Set<Character> set = new HashSet<>();
        char[] arr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (set.contains(arr[i])) {
                return false;
            } else {
                set.add(arr[i]);
            }
        }

        return true;
    } //time-complexity O(n) worst, O(n) average, O(1) best ; space-complexity O(1) -> method does not allocate any extra space
//not really sure about complexities
}
