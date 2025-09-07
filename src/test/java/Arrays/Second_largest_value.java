package Arrays;

public class Second_largest_value {
    public static void main(String[] args) {
        int[] num = {10, 3, 5, 7, 9, 34, 56, 67};
        int tempNum = 0;
        int sMax = 0;

        for (int i = 0; i < num.length; i++) {
            if (tempNum < num[i]) {
                tempNum = num[i];
            }
        }
        System.out.println("Largest number in array: " + tempNum);
        for(int i=0; i<num.length; i++){
            if(0<num[i] && tempNum>num[i]){
                sMax = num[i];
            }
        }
        System.out.println("Second largest number: "+sMax);
    }
}
