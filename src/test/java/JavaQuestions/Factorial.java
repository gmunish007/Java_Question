package JavaQuestions;

// print factorial of a number

public class Factorial {
    public static void main(String[] args) {
        int num=5, n=1;
        for(int i=1; i<=num; i++){
            n=n*i;
        }
        System.out.println(n);
    }
}
