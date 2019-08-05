package volume3;
/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

public class Chapter1Task1 {

    public static void main(String[] args) {
        System.out.println("Uniqueness of chars: " + areCharsUnique("asdfghjkl"));
    }

    public static boolean areCharsUnique(String string) {
        for(int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                    if (string.toCharArray()[i] == string.toCharArray()[j]) {
                        return false;
                    }
                }
            }
        return true;
        }
}
