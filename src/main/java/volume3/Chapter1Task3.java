package volume3;

public class Chapter1Task3 {

    static char[] arr = {'G', 'r', 'e', ' ', ' ', 'g'};

    public static void main(String[] args) {
        System.out.println("Array after replacing: " + replaceSpaces(arr));
    }

    public static String replaceSpaces(char[] arr) {
        String str = new String(arr);
        return str.replaceAll("\\s", "%20");
    }
}
