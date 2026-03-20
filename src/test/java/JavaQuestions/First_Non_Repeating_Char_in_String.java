package JavaQuestions;

public class First_Non_Repeating_Char_in_String {
    public static char nonRepChar(String str) {
        char[] s1 = str.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            int flag = 1;
            for (int j = 0; j < s1.length; j++) {
                if (i != j && s1[i] == s1[j]) {
                    flag = 2;
                    break;
                }
            }
            if (flag == 1)
                return s1[i];
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "abcdeabcdef";
        System.out.println(nonRepChar(str));
    }
}
