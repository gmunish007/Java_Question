package Arrays;

import java.util.Scanner;

// find maximum number in array without using sort function

public class max_value {

    public static int[] max_value() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int arrLen = arr.length;

        System.out.println("input array values: ");
        for (int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrPrint = max_value();
        int temp = 0; // temp variable to compare values from array

        for (int j = 0; j < arrPrint.length; j++) {
            if (temp < arrPrint[j]) {
                temp = arrPrint[j];
            }
        }
        System.out.println("max number in array is: " + temp);
    }
}
