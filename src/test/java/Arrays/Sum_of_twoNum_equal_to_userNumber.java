package Arrays;

public class Sum_of_twoNum_equal_to_userNumber {
    public static void twoNum(int[] num, int target) {
        int numLen = num.length;
        int [] ans=new int[2];

        for (int i = 0; i < numLen; i++) {
            for (int j = i+1; j < numLen; j++) {
                if (num[i] + num[j] == target) {
                    ans[0] = num[i];
                    ans[1] = num[j];
                }
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6, 7, 8};
        twoNum(num, 9);
        //System.out.println(ans);
    }
}
