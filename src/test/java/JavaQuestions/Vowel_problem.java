package JavaQuestions;

public class Vowel_problem {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String str = "arsedfeounbahd";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == vowels[i]) {
                System.out.println("found vowel "+str.charAt(i));
            }

        }
    }
}
