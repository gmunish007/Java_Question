package Arrays;

public class Sum_of_all_elements_in_Array {
    public static void ArraySum(int[] num) {
        int numLen = num.length;
        int temp = 0;
        for (int i = 0; i < numLen; i++) {
            System.out.println(num[i]);
            temp = temp + num[i];
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int[] decNum = {5, 6, 7, 8, 2};
        ArraySum(decNum);
    }
}
