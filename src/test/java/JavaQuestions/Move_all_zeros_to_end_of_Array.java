package JavaQuestions;

//input: {0,1,0,2}
//output: {1,2,0,0}

public class Move_all_zeros_to_end_of_Array {
    public static void pushZero(int[] num) {
        if (num == null || num.length == 0) {
            return;
        }

        int count = 0;

        //iterating through array and move all non-zero elements to the front
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[count] = num[i];
                count++;
            }
        }

        //fill remaining positions with zero
        while (count < num.length) {
            num[count++] = 0;
            //count++;
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 4, 5};
        int[] num1 = {0, 0, 1, 3, 0};

        pushZero(num);
        pushZero(num1);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " \n");
        }

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
    }
}
