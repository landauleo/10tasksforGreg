package volume3;

public class Chapter1Task3 {

    static char[] arr = {'G', 'r', 'e', ' ', ' ', 'g'};

    public static void main(String[] args) {
        System.out.println("Array after replacing: " + replaceSpacesV3(arr));
    }

    public static String replaceSpacesV1(char[] arr) {
        String str = new String(arr);
        return str.replaceAll("\\s", "%20");
    }

    public static String replaceSpacesV2(char[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }


    public static String replaceSpacesV3(char[] arr) {
        int spaces = 0;
        int lengthWithSpaces;
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                spaces++;
            }
        }

        lengthWithSpaces = arr.length + spaces * 2;
        char[] newArr = new char[lengthWithSpaces]; //вот тут хз, не противоречит ли это in-space-operation

        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                newArr[lengthWithSpaces - 1] = '0';
                newArr[lengthWithSpaces - 2] = '2';
                newArr[lengthWithSpaces - 3] = '%';
                lengthWithSpaces -= 3;
            } else {
                newArr[lengthWithSpaces - 1] = arr[i];
                lengthWithSpaces--;
            }
        }
        return String.valueOf(newArr);
    }
}
