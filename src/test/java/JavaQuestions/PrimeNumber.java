package JavaQuestions;

public class PrimeNumber {
    public static void main(String[] args)
    {
        int n=100, i, j;
        for(i=2; i<=n; i++){
            for(j=2; j<=i/2; j++){
                if(i%j==0)
                    break;
            }
            if(j>i/2){
                System.out.println(i);
            }
        }
    }
}
