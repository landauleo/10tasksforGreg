package volume3;
/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

public class Chapter1Task1 {

    public static void main(String[] args) {
        System.out.println("Uniqueness of chars: " + areCharsUnique("abrakadabra"));
    }

    public static boolean areCharsUnique(String string) {
        if (string.length() > 128) return false; //превышает кол-во уникальных знаков

        boolean [] uniqie = new boolean[128]; //показатель уникальности знака
        for (int i = 0; i < string.length(); i++) {
            int index = string.charAt(i);
            if(uniqie[index]) { //если есть такой же знак (по дефолту false)
                return false;
            }
            uniqie[index] = true;
        }
        return true;
    }
}
