package Arrays;

import java.util.Scanner;
//input array size and values from user then print the array

public class Input_arraySize_and_value_from_user {
    public static int[] arrayNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size: ");
        int arraySize = sc.nextInt();
        int[] num = new int[arraySize];
        int numLen = num.length;

        for (int i = 0; i < numLen; i++) {
            System.out.print("Input Array num: ");
            num[i] = sc.nextInt();
        }
        return num;
    }
    public static void main(String[] args){
        int[] newNum = arrayNum();
        for(int i=0; i<newNum.length; i++){
            System.out.print(newNum[i]+" ");
        }
    }

}
