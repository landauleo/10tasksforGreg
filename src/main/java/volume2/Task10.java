package volume2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.println("Vowels and consonant: "+getResult(n));
    }
    
    public static String getResult(String n) {
        int v = 0;
        int c = 0;
        Set<Character> vowels = new HashSet<Character>();
        for (char ch : "aeiou".toCharArray()) {
            vowels.add(ch);
        }
        for (char ch: n.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.contains(Character.toLowerCase(ch))) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        return v + " " + c;
    }
}
