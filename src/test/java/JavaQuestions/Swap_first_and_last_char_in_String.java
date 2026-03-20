package JavaQuestions;

public class Swap_first_and_last_char_in_String {
    public static String stringSwap(String str) {

        char[] c = str.toCharArray();
        char temp = c[0];
        c[0] = c[c.length - 1];
        c[c.length - 1] = temp;

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        System.out.println(stringSwap("abcd"));
    }
}
