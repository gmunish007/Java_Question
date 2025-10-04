package Arrays;

// print all unique characters from string

public class unique_characters {
    public static void main(String[] args) {
        String str = "helloworkd";
        char[] c = str.toCharArray();
        boolean[] b = new boolean[str.length()];
        for (int i = 0; i < c.length; i++) {
            if (b[i]) continue;
            int count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    b[j] = true;
                }
            }
            if (count < 2) {
                System.out.println(c[i]);
            }
        }
    }
}
