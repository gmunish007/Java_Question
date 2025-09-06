package Arrays;

public class Smallest_Number {
    public static void main(String[] args) {
        int[] num = {7, 3, 4, 5, 6, 81};
        int numlen = num.length;
        int temp = num[0];

        for (int i = 0; i < numlen; i++) {
            if (temp>num[i]){
                temp=num[i];
            }
        }
        System.out.println(temp);
    }
}
