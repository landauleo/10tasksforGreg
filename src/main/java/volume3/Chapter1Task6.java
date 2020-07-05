package volume3;

/**
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string,
 * your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class Chapter1Task6 {
    public static void main(String[] args) {
        System.out.println("String compression result is: " + compressString("aabcccccaaa"));
    }


    static String compressString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        var counter = 1;
        for(int i = 1;  i < str.length(); i++) {
            var j = i - 1;
            if(str.charAt(i) == str.charAt(j)) {
                counter++;
            } else {
                stringBuilder.append(counter).append(str.charAt(i));
                counter = 1;
            }
        }
        stringBuilder.append(counter);
        return str.length() < stringBuilder.length() ? str : stringBuilder.toString();
    }

}
//time-complexity O(2n) average, O(n) best, O(1) worst, space-complexity O(1) -> extra space is not dependent on the size of the input size itself



