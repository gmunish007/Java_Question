// String reverse by removing spaces between them
// 1. Remove spaces between them
// 2. Reverse the string

public class StringReverseWithNoSpaces {

    public static String removeSpace(String str) {

        char[] charArray = str.toCharArray();

        String empStr = "";

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                empStr = empStr + charArray[i];
            }
        }
        return empStr;
    }

    public static void main(String[] args) {

        String s = "hello workd";
        String str = removeSpace(s);
        System.out.println("String after no spaces:" + str);

        String revStr = " ";
        char revCh;

        for (int i = 0; i < str.length(); i++) {
            revCh = str.charAt(i);
            revStr = revCh + revStr;
        }
        System.out.println("Reversed String:" + revStr);
    }
}
