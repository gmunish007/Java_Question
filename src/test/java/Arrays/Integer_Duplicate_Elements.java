package Arrays;

public class Integer_Duplicate_Elements {
    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 3, 7, 8, 5};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
