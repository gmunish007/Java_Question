package JavaQuestions;

// a3b2c1 = > aaabbc

public class Expand_String {
    public static String expand(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //check if ch is letter or not
            if (Character.isLetter(ch)) {

                // now check if next Character is digit or char
                if (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {

                    //if the next Character is a number then get that number is a val and run loop on it that many times
                    int count = Character.getNumericValue(str.charAt(i + 1));
                    for (int j = 0; j < count; j++) {

                        // now append the char, count number of times into StringBuilder
                        result.append(ch);
                    }
                    i++; //skip the digit in next iteration
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(expand("a1b2c1"));
    }

}
