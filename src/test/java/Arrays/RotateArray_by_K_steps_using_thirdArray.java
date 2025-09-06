package Arrays;

public class RotateArray_by_K_steps_using_thirdArray {

    public static void rotateArray(int[] num, int k) {

        int numLen = num.length;
        int[] tempArray = new int[numLen];

        for (int i = 0; i <k; i++) {
            tempArray[i] = num[i];
            System.out.print(tempArray[i]+" ");
        }
        System.out.println();

        for(int i=k; i<numLen; i++){
            tempArray[i] = num[i];
            System.out.print(tempArray[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < tempArray.length; i++) {
            System.out.print(tempArray[i] + "= ");
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6, 7, 8, 9};
        rotateArray(num, 3);

    }
}
