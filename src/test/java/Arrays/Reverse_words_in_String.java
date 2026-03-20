package Arrays;

//Input: " i love programming very much"
//Output: "much very programming love i"


public class Reverse_words_in_String {
    public static String check(String str) {
        String result = "";
        String rev = "";

        //reverse entire string "abc xyz" to "zyx cba".
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        //System.out.println(rev); //entire string reversed


        //getting one word in a string
        String revSplit[] = rev.split(" ");

        for (int i = 0; i < revSplit.length; i++) {
            String word = revSplit[i];
            String revWord = "";

            //reverse that one word again
            String newWord = "";
            for (int j = 0; j < word.length(); j++) {
                revWord = word.charAt(j) + revWord;
            }
            result = result + revWord + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check("i love programming very much"));
    }
}
