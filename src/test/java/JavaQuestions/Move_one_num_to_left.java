package JavaQuestions;

//input : {1,2,3,4,5}
//output: {2,3,4,5,1}

public class Move_one_num_to_left {

    public static void moveLeft(int[] num) {
        int numLen = num.length;
        int first = num[0];

        for (int i = 0; i < numLen-1; i++) {
            num[i] = num[i + 1];
        }
        num[numLen - 1] = first;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        moveLeft(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
    }
}
