package JavaQuestions;

import java.util.Arrays;

public class Second_Smallest_And_Largest_Number {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2};
        Arrays.sort(num);
        int sNum = 0, lNum = 0;

        sNum = num[1];
        lNum = num[num.length - 2];
        System.out.println(sNum + ":" + lNum);
    }
}
