package JavaQuestions;

import java.util.Scanner;

public class Int_to_String {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inut number");
        int num = sc.nextInt();

        //converted int to String
        String str = Integer.toString(num);

        // checking if converted to String
        if(str instanceof String){
            System.out.println("Converted to String.");
        }
        else{
            System.out.println("not convrted.");
        }

    }
}
