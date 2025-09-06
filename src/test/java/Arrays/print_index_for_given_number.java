package Arrays;

// take array size,and array values as input
// print index of all numbers from array whose value is less than given by user

import java.util.Scanner;

public class print_index_for_given_number {
    public static void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int arraySize = sc.nextInt();
        int[] marksArray = new int[arraySize];
        int marksLen = marksArray.length;

        for (int i = 0; i < marksLen; i++) {
            System.out.print("Input marks: ");
            marksArray[i] = sc.nextInt();
        }
        System.out.print("Enter number:");
        int getNum = sc.nextInt();

        for (int i = 0; i < marksArray.length; i++) {

            if (marksArray[i] < getNum) {
                System.out.println("Printing index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        marks();
    }
}
