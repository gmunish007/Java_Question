package Arrays;

public class ReverseArray_withoutUsing_SecondArray {
    public static int[] revNumMethod(int[] num) {
        int numLen = num.length;
        int i = 0, j = num.length - 1;

        // same implementation can be done using while loop
//        while(i<j){
//            int temp = num[i];
//            num[i] = num[j];
//            num[j] = temp;
//            i++;
//            j--;
//        }
        for (; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] num = {3, 4, 56, 1, 2};
        int[] revNum = revNumMethod(num);

        for (int i = 0; i < revNum.length; i++) {
            System.out.print(revNum[i] + " ");
        }
    }
}
