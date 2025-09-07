package Arrays;

// reverse an array using third array

public class Reverse_IntArray_using_SecondArray {
    public static int[] reverse(int[] num) {
        int numLen = num.length;
        int[] temp = new int[numLen];
        int tempLen = temp.length;

        for (int i = 0; i < numLen; i++) {
            temp[tempLen - 1 - i] = num[i];
        }
        return temp;
    }
    public static void main(String[] args){
        int [] num = {3,4,5,6,0};
        int [] revNum = reverse(num);

        for(int i=0; i<revNum.length; i++){
            System.out.print(revNum[i]+" ");
        }
    }
}
