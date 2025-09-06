package Arrays;

import java.util.Scanner;

// find all numbers in array greater than a user defined number
// then count those numbers

public class no_of_element_greaterThan_UserNumber {
    public static void greaterThan() {
        int[] num = {4, 2, 6, 5, 9, 10};
        int numLen = num.length;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputNum = sc.nextInt();

        for (int i = 0; i < numLen; i++) {
            if (inputNum < num[i]) {
                count++;
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Count:"+count);
    }

    public static void main(String[] args) {
        greaterThan();
    }
}
