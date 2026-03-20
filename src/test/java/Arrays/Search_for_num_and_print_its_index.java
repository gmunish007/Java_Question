package Arrays;

import java.util.Scanner;

// search for a number in Array and print its index and the number

public class Search_for_num_and_print_its_index {
    public static void main(String[] args) {
        boolean flag = false; //number not found in array

        int[] arr = {1, 3, 5, 6, 2};
        int findNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (findNum == arr[i]) {
                System.out.println(arr[i] + " is at index:" + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("not found.");
        }
    }
}
