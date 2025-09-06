package JavaQuestions;

// reverse "abc xyz' to "cba zyx"
public class Each_String_Reverse {
    public static void main(String[] args) {
        String str = "abc xyz";
        String[] words = str.split(" ");
        String reverseString = "";
        char ch;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reverseWord = "";

            for (int j = 0; j < word.length(); j++) {
                ch = word.charAt(j);
                reverseWord = ch + reverseWord;
            }
            reverseString = reverseString + reverseWord + " ";
            System.out.println(reverseString);
        }

    }
}
