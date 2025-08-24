package TestNg.JavaQuestions;

public class SwapTwoNumWithoutThirdVar {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        num2 = num1 + num2; //num2=12
        num1 = num2 - num1; //12-5=7
        num2 = num2 - num1; //12-7=5

        System.out.println("Value of Number 1:" + num1);
        System.out.println("Value of Number 2:" + num2);
    }
}
