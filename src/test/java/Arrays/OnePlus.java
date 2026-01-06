package Arrays;

// input Array: {1,2,3}
// output array: {1,2,4}

public class OnePlus {
    public static int[] onePlusNum(int[] num) {
        int numLen = num.length;

        for (int i = numLen - 1; i >= 0; i--) {
            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            else {
                num[i] = 0;
            }
        }

        // if all digits are 9,9,9 then add new number and assign 1 to it.
        int[] newNum = new int[numLen + 1];
        newNum[0] = 1;
        return newNum;
    }
}
