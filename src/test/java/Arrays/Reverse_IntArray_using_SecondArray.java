package Arrays;

// reverse an array using second array

public class Reverse_IntArray_using_SecondArray {
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 0};
        int numLen = num.length;
        int[] temp = new int[numLen];
        int tempLen = temp.length;

        for (int i = 0; i < numLen; i++) {
            temp[tempLen - 1 - i] = num[i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
