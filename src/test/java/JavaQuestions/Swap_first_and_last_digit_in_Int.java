package JavaQuestions;

public class Swap_first_and_last_digit_in_Int {
    public static int check(int num) {
        String temp = Integer.toString(num);

        char[] ch = temp.toCharArray();

        char first = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = first;

        return Integer.parseInt(String.valueOf(ch));
    }

    public static void main(String[] args){
        System.out.println(check(1234));
    }
}
