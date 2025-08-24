package TestNg.JavaQuestions;// A string is said to be palindrome if the reverse of string is same as original

public class StringPalindrome {

    public static String stringPal(String s){
        String str ="";
        char ch;

        for(int i=0; i<s.length(); i++){
            ch=s.charAt(i);
            str=ch+str;
        }
        System.out.println("Reversed String: "+str);
        return str;
    }

    public static void main(String[] args){

        String originalStr = "1234321";
        String reverseStr = stringPal(originalStr);

        if(originalStr.equalsIgnoreCase(reverseStr)){
            System.out.println("String is palindrome!");
        }
        else{
            System.out.println("String is not palindrome!");
        }
    }
}
