package volume3;

public class Chapter1Task3 {

    static char[] arr = {'G', 'r', 'e', ' ', ' ', 'g'};

    public static void main(String[] args) {
        System.out.println("Array after replacing: " + replaceSpacesV1(arr));
    }

    public static String replaceSpacesV1(char[] arr) {
        String str = new String(arr);
        return str.replaceAll("\\s", "%20");
    }

    public static String replaceSpacesV2(char[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                stringBuilder.append("%20");
            }
            else {
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }

}
