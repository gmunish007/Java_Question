package JavaQuestions;

public class Missing_num_in_Array {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5};
        int nSize = num.length + 1;
        int missing = 0, actual_num = 0;

        int N = nSize * (nSize + 1) / 2;

        for (int i = 0; i < num.length; i++) {
            actual_num = actual_num + num[i];
        }
        missing = N - actual_num;
        System.out.println(missing);
    }
}
