package volume2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task10 {

    public static Set<Character> vowels = new HashSet<Character>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        for (char ch : "aeiou".toCharArray()) {
            vowels.add(ch);
        }
        System.out.println("Vowels: " + getVowels(string) + " consonant: " + getConsonant(string));
    }

    public static int getVowels(String string) {
        int v = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.contains(Character.toLowerCase(ch))) {
                    v++;
                }
            }
        }
        return v;
    }

    public static int getConsonant(String string) {
        int c = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (!vowels.contains(Character.toLowerCase(ch))) {
                    c++;
                }
            }
        }
        return c;
    }
}
