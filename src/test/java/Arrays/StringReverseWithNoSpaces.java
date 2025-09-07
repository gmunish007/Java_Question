package Arrays;// String reverse by removing spaces between them
// 1. Remove spaces between them
// 2. Reverse the string

public class StringReverseWithNoSpaces {

    public static String removeSpace(String str) {

        char[] charArray = str.toCharArray();

        String empStr = "";

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                empStr = charArray[i] + empStr;
            }
        }
        return empStr;
    }

    public static void main(String[] args) {
        String str = removeSpace("hello workd");
        System.out.println("String after no spaces:" + str);
    }
}
