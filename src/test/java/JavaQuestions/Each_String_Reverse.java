package JavaQuestions;

// reverse "abc xyz' to "cba zyx"
public class Each_String_Reverse {
    public static void main(String[] args) {
        String str = "abc xyz";
        String[] words = str.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for (int j = 0; j < word.length(); j++) {
                reverseWord = word.charAt(j) + reverseWord;
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }
}
