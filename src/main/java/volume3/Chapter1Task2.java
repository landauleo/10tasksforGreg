package volume3;

public class Chapter1Task2 {
    public static void main(String[] args) {
        System.out.println("One string is a permutation of another: " + isStringPermutation("твойкодговно", "говнотвойкод"));
    }

    public static boolean isStringPermutation(String str1, String str2) {
       if (str1.length() == str2.length()) {
           for (int i = 0; i < str2.length(); i++) {
               if (str1.indexOf(str2.charAt(i)) < 0) {
                    return false;
               }
           } return true;
       } return false;
    }
}
