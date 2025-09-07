package Arrays;

public class String_to_charArray {
    public static void main(String[] args) {
        String str = "hello workd";
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.print(ch[i]+ " ");
        }
    }
}
