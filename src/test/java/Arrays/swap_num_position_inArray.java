package Arrays;

public class swap_num_position_inArray {
    public static void swap(int[] num) {
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 5};
        System.out.println(a[0] + ":" + a[1]);
        swap(a);
        System.out.println(a[0] + ":" + a[1]);
    }
}
