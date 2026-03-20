package JavaQuestions;

public class Sort_int_array_without_sortFunction {
    public static void main(String[] args) {
        int[] num = {3, 1, 2, 5, 6, 7};

        int temp = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i] + " ");
        }
    }
}
