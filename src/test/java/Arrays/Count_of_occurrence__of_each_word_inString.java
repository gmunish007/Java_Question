package Arrays;

public class Count_of_occurrence__of_each_word_inString {
    public static void main(String[] args) {
        String str = "My name is munish name My";

        String[] s1 = str.split(" ");
        boolean [] b = new boolean[s1.length];

        for (int i = 0; i < s1.length; i++) {
            if (b[i]) continue;
            int count =0;

            for (int j = 0; j < s1.length; j++) {
                if (s1[i].equalsIgnoreCase(s1[j])) {
                    count++;
                    b[j]=true;
                    //break;
                }
            }
            System.out.println(s1[i] + ": " + count);
        }
    }
}
