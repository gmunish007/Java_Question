package JavaQuestions;

public class Palindrome_Integer {
    public static void main(String[] args){
        int num=121;
        int r, sum=0;
        int tem=num;

        while(num>0){
            r=num%10; //getting remainder
            System.out.println(r);
            sum=(sum*10)+r;
            num=num/10; // getting quotient
        }
        System.out.println(sum);

    }
}
