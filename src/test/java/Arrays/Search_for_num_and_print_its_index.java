package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

// search for a number in Array and print its index and the number

public class Search_for_num_and_print_its_index {

    public static void marks() {

        Scanner sc = new Scanner(System.in);
        // input array size
        System.out.print("input array Size: ");
        int arrSize = sc.nextInt();
        int[] arrVal = new int[arrSize];
        int arrLen = arrVal.length;

        boolean flag = false; //number not found in array

        //input array values
        for (int i = 0; i < arrLen; i++) {
            arrVal[i] = sc.nextInt();
        }

        //input number to find from array
        System.out.print("Input num to find: ");
        int findNum = sc.nextInt();

        for (int i = 0; i < arrLen; i++) {
            if (findNum == arrVal[i]) {
                System.out.println(arrVal[i] + " is at index:" + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("not found.");
        }
        //else{
        //   System.out.println("found it.");
        //}
    }

    public static void main(String[] args) {
        marks();
    }
}
