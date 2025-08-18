public class FreqOfEachCharInString {

    public static void freqString(String str) {
        char newStr;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i);
            count++;
            System.out.println(newStr + ":" + count);
        }
    }

    public static void main(String[] args) {

        freqString("hellosfed");

    }
}
