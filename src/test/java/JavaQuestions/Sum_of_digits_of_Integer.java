package JavaQuestions;
//123 => 6


public class Sum_of_digits_of_Integer {
    public static void main(String[] args) {
        int temp = 0, i = 0, num = 40, result = 0;

        while (i < num) {
            temp = num % 10;
            num = num / 10;
            result = result + temp;
        }
        System.out.println(result);
    }

}
